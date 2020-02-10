package com.medince.service;

import java.util.ArrayList;
import java.util.List;

import com.taotao.pojo.ItemCat;
import com.taotao.pojo.ItemCatExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medince.mapper.ItemCatMapper;
import com.medince.service.inteface.ItemCatService;
import tree.CatDate;
import com.medince.utils.ResultDate;

@Service
public class ItemCatServiceimpl implements ItemCatService{

	@Autowired
	private ItemCatMapper catMapper;
	
	@Override
	public ResultDate getItemCatLis() {
		// TODO Auto-generated method stub
		ResultDate result = new ResultDate();
		result.setData(getCatList(0));
		return result;
	}
	
	private List<Object> getCatList(Integer parentId) {
		
		ItemCatExample item = new ItemCatExample();
		
		ItemCatExample.Criteria cr = item.createCriteria();
		
		cr.andParentIdEqualTo(parentId);
		
		List<ItemCat> list = catMapper.selectByExample(item);
		
		List<Object> resulList = new ArrayList();
		
		for(ItemCat ItemCat : list) {
			
			if(ItemCat.getIsParent()==1) {
				CatDate cat = new CatDate();
				if(parentId == 0) {
				cat.setName("<a href='/products/" + ItemCat.getId() + ".html'>" + ItemCat.getName() + "</a>");
			} else {
				cat.setName(ItemCat.getName());
			}
				cat.setUrl("/products/" + ItemCat.getId() + ".html");
				cat.setItem(getCatList(ItemCat.getId()));
				resulList.add(cat);
			} else {
				resulList.add("/products/" + ItemCat.getId() + ".html|" + ItemCat.getName() + "");
			}
			
		}
		return resulList;
	}

}
