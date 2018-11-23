package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Onlinetranshist;
import com.xbk.mybatis.model.OnlinetranshistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinetranshistMapper {
    long countByExample(OnlinetranshistExample example);

    int deleteByExample(OnlinetranshistExample example);

    int deleteByPrimaryKey(String transseqnbr);

    int insert(Onlinetranshist record);

    int insertSelective(Onlinetranshist record);

    List<Onlinetranshist> selectByExample(OnlinetranshistExample example);

    Onlinetranshist selectByPrimaryKey(String transseqnbr);

    int updateByExampleSelective(@Param("record") Onlinetranshist record, @Param("example") OnlinetranshistExample example);

    int updateByExample(@Param("record") Onlinetranshist record, @Param("example") OnlinetranshistExample example);

    int updateByPrimaryKeySelective(Onlinetranshist record);

    int updateByPrimaryKey(Onlinetranshist record);
}