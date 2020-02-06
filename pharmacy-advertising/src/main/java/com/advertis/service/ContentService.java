package com.advertis.service;

import com.advertis.pojo.Content;
import com.advertis.pojo.MedicineMessage;

import java.util.List;

/**
 * Created by Administrator on 2020/1/30 0030.
 */
public interface ContentService {

    //查询content内容列表所有
    public List<Content> getContentList();

    //查询促销商品信息
    public List<MedicineMessage> getMedicineStatus();
}
