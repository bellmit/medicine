package com.portal.controller;

import com.taotao.pojo.MedicineMessage;
import httpClient.HttpClientUtil;
import json.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import result.MedinceResult;

@Controller
@RequestMapping("/item")
public class ItemController {

    /**
     * 查询药品的基本信息
     *
     * @param itemId
     * @return
     */
    @RequestMapping("/message/{itemId}")
    public String queryMessage(@PathVariable Integer itemId, Model model) {
        String json = HttpClientUtil.doGet("http://localhost:8085/item/message/" + itemId);
        MedicineMessage medicineMessage = JsonUtils.jsonToPojo(json, MedicineMessage.class);
        model.addAttribute("med",medicineMessage);
        return "item";
    }


    /**
     * 查询药品的详情信息
     * @param itemId
     * @return
     */
    @RequestMapping(value = "/desc/{itemId}",produces = "application/json; charset=utf-8")
    @ResponseBody
    public MedinceResult queryDesc(@PathVariable String itemId){
        String data = HttpClientUtil.doGet("http://localhost:8085/item/desc/" + itemId);
        return MedinceResult.ok(data);
    }



    /**
     * 查询药品的说明书
     * @param itemId
     * @return
     */
    @RequestMapping(value = "/explain/{itemId}",produces = "application/json; charset=utf-8")
    @ResponseBody
    public MedinceResult queryExplain(@PathVariable String itemId){
        String data = HttpClientUtil.doGet("http://localhost:8085/item/explain/" + itemId);
        return MedinceResult.ok(data);
    }

    /**
     * 查询药品的评价
     * @param drugId
     * @return
     */
    @RequestMapping(value = "/appraise/{drugId}",produces = "application/json; charset=utf-8")
    @ResponseBody
    public MedinceResult queryAppraise(@PathVariable String drugId){
        String data = HttpClientUtil.doGet("http://localhost:8085/item/appraise/" + drugId);
        return MedinceResult.ok(data);
    }


    @RequestMapping(value = "/appraise/count",produces = "application/json; charset=utf-8")
    @ResponseBody
    public MedinceResult queryAppraiseCount(){
        String data = HttpClientUtil.doGet("http://localhost:8080/aa/medin/appraise/count");
        System.out.println("条数："+data);
        return MedinceResult.ok(data);
    }
}
