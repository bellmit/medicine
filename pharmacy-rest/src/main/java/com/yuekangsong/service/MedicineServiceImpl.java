package com.yuekangsong.service;

import org.springframework.stereotype.Service;
import vo.*;

@Service
public class MedicineServiceImpl implements MedicineService {

    /**
     * 查询商品的基本信息
     * @param itemId
     * @return
     */
    @Override
    public MedicineMessage query(String itemId) {
        MedicineMessage message = new MedicineMessage(); //等接口
        return message;
    }

    /**
     * 查询药品的详情信息
     * @param itemId
     * @return
     */
    @Override
    public ItemDesc queryDesc(String itemId) {
        ItemDesc itemDesc = new ItemDesc(); //等接口
        return itemDesc;
    }

    /**
     * 查询药品的说明书
     * @param itemId
     * @return
     */
    @Override
    public ItemExplain queryExplain(String itemId) {
        ItemExplain itemExplain = new ItemExplain(); //等接口
        return itemExplain;
    }

    /**
     * 查询药品的销售记录
     * @param itemId
     * @return
     */
    @Override
    public Sales querySales(String itemId) {
        Sales sales = new Sales(); //等接口
        return sales;
    }

    /**
     * 查询药品的评价
     * @param drugId
     * @return
     */
    @Override
    public Appraise queryAppraise(String drugId) {
        Appraise appraise = new Appraise(); //等接口
        return appraise;
    }


}
