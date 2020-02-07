package com.portal.service.impl;

import com.portal.service.UserService;
import org.springframework.stereotype.Service;
import result.MedicineResult;
import com.taotao.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Lenovo on 2020/1/18.
 *
 * @Author: LDH
 * @date:2020/1/18 14:00
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public MedicineResult checkData(String content) {
        return null;
    }

    @Override
    public MedicineResult createUser(User user) {
        return null;
    }

    @Override
    public MedicineResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response) {
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
