package com.portal.controller;

import com.portal.service.ContentService;
import com.taotao.pojo.Content;
import com.taotao.pojo.MedicineMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2020/2/9 0009.
 */
@Controller
public class ContentController {

    @Autowired
   private ContentService contentService;

    @RequestMapping("/imgContent")
    public String getContentList(HttpServletRequest request){
        List<Content> contentList = contentService.getContentList();
       request.getSession().setAttribute("content",contentList);
        System.out.println("123:"+contentList);
        return "index";
    }
    @RequestMapping("/messagesStatus")
    public String getMessagesStatus(HttpServletRequest request){
        List<MedicineMessage> messageStatus = contentService.getMessageStatus();
        request.getSession().setAttribute("messageStatus",messageStatus);
        System.out.println("Status:"+messageStatus);
        return "index";
    }

}
