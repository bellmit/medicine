package com.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2020/1/27 0027.
 */
@Controller
public class ShowConterllo {
    @RequestMapping("/")
    public String show(){
        return "index";
    }
}
