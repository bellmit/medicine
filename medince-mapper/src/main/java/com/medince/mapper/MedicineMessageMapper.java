package com.medince.mapper;

import com.taotao.pojo.MedicineMessage;
import com.taotao.pojo.MedicineMessageExample;
import java.util.List;
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