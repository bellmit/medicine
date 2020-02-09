package com.portal.controller;

import com.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/12/3 0003.
 */
@Controller
public class IndexController {

    @Autowired
    private ContentService contentService;
    @RequestMapping("/")
    public String showIndex(Model model){
        String adJson = contentService.getContentList();
        model.addAttribute("ad1", adJson);

        return "index";
    }
}
