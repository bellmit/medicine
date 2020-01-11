package com.yuekangsong.service;

import vo.*;

public interface MedicineService {

    //查询药品的基本信息
    public MedicineMessage query(String itemId);

    //查询商品的详情信息
    public ItemDesc queryDesc(String itemId);

    //查询药品的说明书
    public ItemExplain queryExplain(String itemId);

    //查询药品的销售记录
    public Sales querySales(String itemId);

    //查询药品的评价
    public Appraise queryAppraise(String drugId);
}
