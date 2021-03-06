package com.medince.mapper;

import java.util.List;

import com.medince.pojo.MedicineMessage;
import com.medince.pojo.MedicineMessageExample;
import org.apache.ibatis.annotations.Param;

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