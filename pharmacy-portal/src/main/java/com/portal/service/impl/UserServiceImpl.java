package com.portal.service.impl;

import com.portal.service.UserService;
import com.taotao.pojo.User;
import httpClient.HttpClientUtil;
import json.JsonUtils;
import org.springframework.stereotype.Service;
import result.MedicineResult;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Lenovo on 2020/2/8.
 *
 * @Author: LDH
 * @date:2020/2/8 14:28
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public MedicineResult checkData(Integer type) {
        return null;
    }

    @Override
    public MedicineResult createUser(User user) {
        return null;
    }

    @Override
    public MedicineResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("username"+username);
        System.out.println("pass"+password);
        String s = "http://localhost:8080/aa/user/userLogin/" + username +"/"+ password;
        System.out.println(s);
        String json = HttpClientUtil.doGet(s);
        System.out.println("====" + json);
        MedicineResult medicineMessage = JsonUtils.jsonToPojo(json, MedicineResult.class);
        return medicineMessage;
    }

    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public MedicineResult isuser(String param) {
        return null;
    }

    @Override
    public MedicineResult getUserByToken(String token) {
        return null;
    }
}
