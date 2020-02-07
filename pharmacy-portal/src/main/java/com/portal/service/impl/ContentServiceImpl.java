package com.portal.service.impl;

import com.advertis.pojo.Content;
import com.portal.service.ContentService;
import httpClient.HttpClientUtil;
import json.JsonUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/2/1 0001.
 */
@Service
public class ContentServiceImpl implements ContentService {
    public String getContentList(){

        String result = HttpClientUtil.doGet("http://localhost:8083/content");
        try {
        List<Content> contentses = JsonUtils.jsonToList(result, Content.class);
        List<Map> resultList = new ArrayList<>();
        //创建一个jsp页码要求的pojo列表
        for (Content tbContent : contentses) {
            Map map = new HashMap<>();
            map.put("src", tbContent.getPic());
            map.put("height", 240);
            map.put("width", 670);
            map.put("widthB", 550);
            map.put("heightB", 240);
            map.put("href", tbContent.getUrl());
            map.put("alt", tbContent.getTitle());
            resultList.add(map);
        }
        return JsonUtils.objectToJson(resultList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
