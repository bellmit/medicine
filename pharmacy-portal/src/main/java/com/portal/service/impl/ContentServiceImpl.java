package com.portal.service.impl;

import com.portal.service.ContentService;
import httpClient.HttpClientUtil;
import json.JsonUtils;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2020/2/1 0001.
 */
@Service
public class ContentServiceImpl implements ContentService {
    public String getContentList(){

        return HttpClientUtil.doGet("http://localhost:8083");

    }
}
