package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Onlinetranshistall;
import com.xbk.mybatis.model.OnlinetranshistallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinetranshistallMapper {
    long countByExample(OnlinetranshistallExample example);

    int deleteByExample(OnlinetranshistallExample example);

    int deleteByPrimaryKey(String transseqnbr);

    int insert(Onlinetranshistall record);

    int insertSelective(Onlinetranshistall record);

    List<Onlinetranshistall> selectByExample(OnlinetranshistallExample example);

    Onlinetranshistall selectByPrimaryKey(String transseqnbr);

    int updateByExampleSelective(@Param("record") Onlinetranshistall record, @Param("example") OnlinetranshistallExample example);

    int updateByExample(@Param("record") Onlinetranshistall record, @Param("example") OnlinetranshistallExample example);

    int updateByPrimaryKeySelective(Onlinetranshistall record);

    int updateByPrimaryKey(Onlinetranshistall record);
}