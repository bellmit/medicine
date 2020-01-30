package com.medince.mapper;

import com.taotao.pojo.Sales;
import com.taotao.pojo.SalesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesMapper {
    int countByExample(SalesExample example);

    int deleteByExample(SalesExample example);

    int insert(Sales record);

    int insertSelective(Sales record);

    List<Sales> selectByExample(SalesExample example);

    int updateByExampleSelective(@Param("record") Sales record, @Param("example") SalesExample example);

    int updateByExample(@Param("record") Sales record, @Param("example") SalesExample example);
}