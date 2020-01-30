package com.medince.service.inteface;

import com.taotao.pojo.Appraise;
import com.taotao.pojo.ItemDesc;
import com.taotao.pojo.ItemExplain;
import com.taotao.pojo.MedicineMessage;
import com.taotao.pojo.Sales;

public interface MedinceService {

	MedicineMessage query(String itemid);
	
	//查询商品的详情信息
	public ItemDesc queryDesc(String itemId);

	//查询药品的说明书
	public ItemExplain queryExplain(String itemId);

	//查询药品的销售记录
	public Sales querySales(String itemId);

	//查询药品的评价
	public Appraise queryAppraise(String drugId);

}
