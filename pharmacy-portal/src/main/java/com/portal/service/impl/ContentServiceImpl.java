package com.portal.service.impl;

import com.taotao.pojo.Content;
import com.portal.service.ContentService;
import com.taotao.pojo.MedicineMessage;
import httpClient.HttpClientUtil;
import json.JsonUtils;
import org.springframework.stereotype.Service;
import result.MedicineResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/2/1 0001.
 */
@Service
public class ContentServiceImpl implements ContentService {
    public List<Content> getContentList(){

        String result = HttpClientUtil.doGet("http://localhost:8083/advertising/content");
        try {
            MedicineResult medicineResult = MedicineResult.formatToList(result, Content.class);
            List<Content> list=(List<Content>)medicineResult.getData();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MedicineMessage> getMessageStatus() {
        String result = HttpClientUtil.doGet("http://localhost:8083/advertising/status");
        try {
            MedicineResult medicineResult = MedicineResult.formatToList(result, MedicineMessage.class);
            List<MedicineMessage> Messagelist=(List<MedicineMessage>)medicineResult.getData();
            return Messagelist;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
