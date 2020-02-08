package com.medince.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medince.service.inteface.MedinceService;
import com.medince.service.inteface.UserService;
import com.taotao.pojo.User;
import result.MedicineResult;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private MedinceService meService;
	
	public UserController() {
		System.out.println("当我被创造的时候");
	}
	
	@RequestMapping("/createUser")
	public MedicineResult createUser(User user) {
		
		return userService.createUser(user);
	}
	
	@RequestMapping("/userLogin/{username}/{password}")
	public MedicineResult userLogin(@PathVariable("username") String username,@PathVariable("password") String password,
                                    HttpServletRequest request,HttpServletResponse response) {
		
		return userService.userLogin(username, password, request, response);
	}
	
	@RequestMapping("/isuser/{param}")
	public MedicineResult isuser(String param) {
		
		return userService.isuser(param);
	}
	
	@RequestMapping("/checkData/{type}")
	MedicineResult checkData(Integer type) {
		
		return userService.checkData(type);
	}
}
