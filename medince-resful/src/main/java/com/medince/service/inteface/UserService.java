package com.medince.service.inteface;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medince.utils.MedicineResult;
import com.taotao.pojo.User;

public interface UserService {

	String login(String username, String pasword);
	

	public MedicineResult createUser(User user);
	
	public MedicineResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);

	public MedicineResult isuser(String param);

	MedicineResult checkData(Integer type);
}
