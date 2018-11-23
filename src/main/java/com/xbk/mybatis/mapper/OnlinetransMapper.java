package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Onlinetrans;
import com.xbk.mybatis.model.OnlinetransExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinetransMapper {
    long countByExample(OnlinetransExample example);

    int deleteByExample(OnlinetransExample example);

    int deleteByPrimaryKey(String transseqnbr);

    int insert(Onlinetrans record);

    int insertSelective(Onlinetrans record);

    List<Onlinetrans> selectByExample(OnlinetransExample example);

    Onlinetrans selectByPrimaryKey(String transseqnbr);

    int updateByExampleSelective(@Param("record") Onlinetrans record, @Param("example") OnlinetransExample example);

    int updateByExample(@Param("record") Onlinetrans record, @Param("example") OnlinetransExample example);

    int updateByPrimaryKeySelective(Onlinetrans record);

    int updateByPrimaryKey(Onlinetrans record);
}