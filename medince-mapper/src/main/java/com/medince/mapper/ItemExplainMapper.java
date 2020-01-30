package com.medince.mapper;

import com.taotao.pojo.ItemExplain;
import com.taotao.pojo.ItemExplainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemExplainMapper {
    int countByExample(ItemExplainExample example);

    int deleteByExample(ItemExplainExample example);

    int insert(ItemExplain record);

    int insertSelective(ItemExplain record);

    List<ItemExplain> selectByExample(ItemExplainExample example);

    int updateByExampleSelective(@Param("record") ItemExplain record, @Param("example") ItemExplainExample example);

    int updateByExample(@Param("record") ItemExplain record, @Param("example") ItemExplainExample example);
}