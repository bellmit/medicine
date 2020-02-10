package com.medince.controller;

import com.medince.service.inteface.ItemCatService;
import com.medince.utils.ResultDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemContorn {

	@Autowired
    ItemCatService sercice;
	
	@RequestMapping("/cat/get")
	public ResultDate getCat() {
		
		return sercice.getItemCatLis();
	}
}
