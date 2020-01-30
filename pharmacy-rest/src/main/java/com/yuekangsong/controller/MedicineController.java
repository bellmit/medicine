package com.yuekangsong.controller;

import com.yuekangsong.service.MedicineService;
import httpClient.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vo.*;

@RestController
@RequestMapping("/item")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    /**
     * 查询药品的基本信息
     * @param itemId
     * @return
     */
    @RequestMapping("/message/{itemId}")
    public MedicineMessage queryMessage(@PathVariable String itemId){
        MedicineMessage message = medicineService.query(itemId);
        return message;
    }

    /**
     * 查询药品的详情信息
     * @param itemId
     * @return
     */
    @RequestMapping("/desc/{itemId}")
    public ItemDesc queryDesc(@PathVariable String itemId){
        ItemDesc itemDesc = medicineService.queryDesc(itemId);
        return itemDesc;
    }

    /**
     * 查询药品的说明书
     * @param itemId
     * @return
     */
    @RequestMapping("/explain/{itemId}")
    public ItemExplain queryExplain(@PathVariable String itemId){
        ItemExplain itemExplain = medicineService.queryExplain(itemId);
        return itemExplain;
    }

    /**
     * 查询药品的销售记录
     * @param itemId
     * @return
     */
    @RequestMapping("/sales/{itemId}")
    public Sales querySales(@PathVariable String itemId){
        Sales sales = medicineService.querySales(itemId);
        return sales;
    }

    /**
     * 查询药品的评价
     * @param drugId
     * @return
     */
    @RequestMapping("/appraise/{drugId}")
    public Appraise queryAppraise(@PathVariable String drugId){
        Appraise appraise = medicineService.queryAppraise(drugId);
        return appraise;
    }
}
