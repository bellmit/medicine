package com.medince.controller;

import com.taotao.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medince.service.inteface.MedinceService;

@RestController
@RequestMapping("/medin")
public class MedinceController {

	@Autowired
	MedinceService meService;
	
	@RequestMapping("/query/{itemId}")
	public MedicineMessage query(@PathVariable String itemId) {
		return meService.query(itemId);
		
	};

	//查询商品的详情信息
	@RequestMapping("/queryDesc/{itemId}")
	public ItemDesc queryDesc(@PathVariable String itemId) {
		return meService.queryDesc(itemId);
	}

	//查询药品的说明书
	@RequestMapping("/queryExplain/{itemId}")
	public ItemExplain queryExplain(@PathVariable String itemId) {
		return meService.queryExplain(itemId);
	}

	//查询药品的销售记录
	@RequestMapping("/querySales/{itemId}")
	public Sales querySales(@PathVariable String itemId) {
		return meService.querySales(itemId);
	}

	//查询药品的评价
	@RequestMapping("/queryAppraise/{drugId}")
	public Appraise queryAppraise(@PathVariable String drugId) {
		return meService.queryAppraise(drugId);
	}

    //查询评价总数
    @RequestMapping("/queryAppraise/count")
    public Integer queryAppraise() {
        return meService.queryAppraiseCount();
    }

}
