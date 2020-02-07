package com.portal.service;

import result.MedicineResult;
import com.taotao.pojo.User;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Lenovo on 2020/1/18.
 *
 * 用户登录注册等服务接口
 *
 * @Author: LDH
 * @date:2020/1/18 13:59
 */

public interface UserService {

    /**
     * 验证是否可以注册
     *
     * @param content
     * @param
     */
    public MedicineResult checkData(String content);

    /**
     * 用户注册  注册根据影响行数判断是否注册成功
     *
     * @param user
     */
    public MedicineResult createUser(User user);

    /**
     * 用户登录
     * @param username
     * @param password
     * @param request
     * @param response
     */
    public MedicineResult userLogin(String username, String password, HttpServletRequest request,
     HttpServletResponse response);

    /**
     * 判断手机号是否注册过
     *
     * @param param
     */
    public MedicineResult isuser(String param);

    /**
     * 根据token从redis中查询用户信息
     *
     * @param token
     */
    public MedicineResult getUserByToken(String token);







}
