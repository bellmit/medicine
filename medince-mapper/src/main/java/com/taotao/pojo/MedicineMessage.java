package com.taotao.pojo;

import java.util.Date;

public class MedicineMessage {
    private Integer id;

    private String itemName;

    private String itemBrand;

    private Long itemStack;

    private Long itemBazaar;

    private Long itemMembership;

    private Long itemPromotion;

    private Byte status;

    private String paramItem;

    private Integer num;

    private Long cid;

    private Date created;

    private Date updated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand == null ? null : itemBrand.trim();
    }

    public Long getItemStack() {
        return itemStack;
    }

    public void setItemStack(Long itemStack) {
        this.itemStack = itemStack;
    }

    public Long getItemBazaar() {
        return itemBazaar;
    }

    public void setItemBazaar(Long itemBazaar) {
        this.itemBazaar = itemBazaar;
    }

    public Long getItemMembership() {
        return itemMembership;
    }

    public void setItemMembership(Long itemMembership) {
        this.itemMembership = itemMembership;
    }

    public Long getItemPromotion() {
        return itemPromotion;
    }

    public void setItemPromotion(Long itemPromotion) {
        this.itemPromotion = itemPromotion;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getParamItem() {
        return paramItem;
    }

    public void setParamItem(String paramItem) {
        this.paramItem = paramItem == null ? null : paramItem.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}