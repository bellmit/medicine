package com.advertis.conterller;

import com.advertis.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Content;

import java.util.List;

/**
 * Created by Administrator on 2020/2/8 0008.
 */
@Controller
public class ContentConterller {
    @Autowired
    private ContentService contentService;

    @RequestMapping("/content")
    public List<Content> getContentList(){
      return  contentService.getContentList();
    }
}
