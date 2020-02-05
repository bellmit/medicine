package com.medince.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medince.mapper.AppraiseMapper;
import com.medince.mapper.ItemDescMapper;
import com.medince.mapper.ItemExplainMapper;
import com.medince.mapper.MedicineMessageMapper;
import com.medince.mapper.SalesMapper;
import com.medince.service.inteface.MedinceService;
import com.taotao.pojo.Appraise;
import com.taotao.pojo.ItemDesc;
import com.taotao.pojo.ItemDescExample;
import com.taotao.pojo.ItemDescExample.Criteria;
import com.taotao.pojo.ItemExplain;
import com.taotao.pojo.ItemExplainExample;
import com.taotao.pojo.MedicineMessage;
import com.taotao.pojo.Sales;
import com.taotao.pojo.SalesExample;

@Service
public class MedinceServiceImpl implements MedinceService{
	
	@Autowired
	MedicineMessageMapper mediMapper;
	
	@Autowired
	ItemDescMapper itemMapper;
	
	@Autowired
	ItemExplainMapper explinMapper;
	
	@Autowired
	SalesMapper saleMapper;
	
	@Autowired
	AppraiseMapper appMapper;
	

	@Override
	public MedicineMessage query(String itemid) {
		
		MedicineMessage me = mediMapper.selectByPrimaryKey(Integer.valueOf(itemid));
		
		return me;
		
	}

	@Override
	public ItemDesc queryDesc(String itemId) {
		// TODO Auto-generated method stub
		
		ItemDescExample example = new ItemDescExample();
		Criteria cr = 	example.createCriteria();
		cr.andItemIdEqualTo(itemId);
		
		List<ItemDesc> list = itemMapper.selectByExample(example);
		
		if(list != null && list.size()>0) {
			return list.get(0);
		}
		
		return null;
	}

	@Override
	public ItemExplain queryExplain(String itemId) {
		// TODO Auto-generated method stub
		
		ItemExplainExample example = new ItemExplainExample();
		
		com.taotao.pojo.ItemExplainExample.Criteria cri = example.createCriteria();
		
		List<ItemExplain> list = explinMapper.selectByExample(example);
		
		if(list != null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Sales querySales(String itemId) {
		// TODO Auto-generated method stub
		
		SalesExample example = new SalesExample();
		com.taotao.pojo.SalesExample.Criteria cri = example.createCriteria();
		cri.andItemIdEqualTo(itemId);
		
		List<Sales> list = saleMapper.selectByExample(example);
		
		if(list != null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Appraise queryAppraise(String drugId) {
		// TODO Auto-generated method stub
		Appraise appraise =  appMapper.selectByPrimaryKey(Integer.valueOf(drugId));
		
		return appraise;
	}
}