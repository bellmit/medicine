package com.medince.service.inteface;

import com.medince.utils.ResultDate;
import com.taotao.pojo.MedicineMessage;

import java.util.List;

public interface ItemCatService {

	public ResultDate getItemCatLis();

	public List<MedicineMessage> getCid(Long cid);
	
}
