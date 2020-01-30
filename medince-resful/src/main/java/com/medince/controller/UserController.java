package com.medince.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medince.service.inteface.MedinceService;
import com.medince.service.inteface.UserService;
import com.taotao.pojo.MedicineMessage;

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

	@RequestMapping("/test")
	public String test() {
		System.out.println("test");
		System.out.println(userService.login("test", "123"));
		return "123";
	}
	
	@RequestMapping("/test/{id}")
	public MedicineMessage test1(@PathVariable String id) {
		System.out.println(id);
		System.out.println(meService.query(id).getItemName());
		return meService.query(id);
	}
}
