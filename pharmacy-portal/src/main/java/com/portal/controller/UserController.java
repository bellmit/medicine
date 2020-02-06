package com.medicine.controller;


import com.medicine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import result.MedicineResult;
import vo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by Lenovo on 2019/12/10.
 *
 * @Author: LDH
 * @date:2019/12/10 21:16
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/check/{param}/{type}")
    @ResponseBody
    public Object checkData(@PathVariable String param, @PathVariable Integer type, String callback) {
        MedicineResult result = null;
        //参数有效性校验
        if (type != 1 && type != 2 && type != 3) {
            result = MedicineResult.build(400, "校验内容类型错误");
        }
        //校验出错
        if (null != result) {
            if (null != callback) {
                MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
                mappingJacksonValue.setJsonpFunction(callback);
                return mappingJacksonValue;
            } else {
                return result;
            }
        }
        //调用服务
        try {
            result = userService.checkData(param, type);

        } catch (Exception e) {
            result = MedicineResult.build(500, e.getMessage());
        }

        if (null != callback) {
            MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
            mappingJacksonValue.setJsonpFunction(callback);
            return mappingJacksonValue;
        } else {
            return result;
        }
    }

    //创建用户
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public MedicineResult createUser(User user) {
        try {
            MedicineResult result = userService.createUser(user);
            return result;
        } catch (Exception e) {
            return MedicineResult.build(500, e.getMessage());
        }
    }

    //用户登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public MedicineResult userLogin(String username, String password, HttpServletRequest request,
                                  HttpServletResponse response) {
        try {
            MedicineResult result = userService.userLogin(username, password, request, response);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return MedicineResult.build(500, e.getMessage());
        }
    }

    @RequestMapping(value = "/isuser/{param}",method = RequestMethod.GET)
    @ResponseBody
    public  MedicineResult isUser(@PathVariable String param){
        MedicineResult user = userService.isuser(param);
        if (param.equals("18832641897")){
            System.out.println("通过");
            return user;
        }else {
          return MedicineResult.build(400, "校验内容类型错误");
        }

    }



}






