package com.portal.controller;

import com.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2020/1/27 0027.
 */
@Controller
public class ShowConterllo {

    @Autowired
    ContentService contentService;

    @RequestMapping("/")
    public String show(Model model){
        String adJson = contentService.getContentList();
        model.addAttribute("ad1", adJson);
        return "index";
    }
}
