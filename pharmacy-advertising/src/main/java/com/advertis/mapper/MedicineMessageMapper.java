package com.advertis.mapper;

import com.advertis.pojo.MedicineMessage;
import com.advertis.pojo.MedicineMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicineMessageMapper {
    int countByExample(MedicineMessageExample example);

    int deleteByExample(MedicineMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicineMessage record);

    int insertSelective(MedicineMessage record);

    List<MedicineMessage> selectByExample(MedicineMessageExample example);

    MedicineMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicineMessage record, @Param("example") MedicineMessageExample example);

    int updateByExample(@Param("record") MedicineMessage record, @Param("example") MedicineMessageExample example);

    int updateByPrimaryKeySelective(MedicineMessage record);

    int updateByPrimaryKey(MedicineMessage record);
}