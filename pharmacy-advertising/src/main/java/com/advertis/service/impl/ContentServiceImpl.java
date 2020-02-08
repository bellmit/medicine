package com.advertis.service.impl;

import com.advertis.mapper.ContentMapper;
import pojo.Content;
import pojo.MedicineMessage;
import com.advertis.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2020/1/30 0030.
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    @Override
    public List<Content> getContentList() {

        System.out.println(2);
        List<Content> contents = contentMapper.selectAll();
        System.out.println(1);
        System.out.println(contents);
        return  contents;
    }
    public Content getContentList1() {

        System.out.println(2);
       Content contents = contentMapper.selectByPrimaryKey(1L);
        System.out.println(1);
        System.out.println(contents);
        return  contents;
    }

    @Override
    public List<MedicineMessage> getMedicineStatus() {
        return null;
    }

    public static void main(String[] args) {
        ContentServiceImpl  c=new ContentServiceImpl();
        //c.getContentList();
        c.getContentList1();
    }
}
