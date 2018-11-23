package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Overalltranshist;
import com.xbk.mybatis.model.OveralltranshistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OveralltranshistMapper {
    long countByExample(OveralltranshistExample example);

    int deleteByExample(OveralltranshistExample example);

    int deleteByPrimaryKey(String overalltransnbr);

    int insert(Overalltranshist record);

    int insertSelective(Overalltranshist record);

    List<Overalltranshist> selectByExample(OveralltranshistExample example);

    Overalltranshist selectByPrimaryKey(String overalltransnbr);

    int updateByExampleSelective(@Param("record") Overalltranshist record, @Param("example") OveralltranshistExample example);

    int updateByExample(@Param("record") Overalltranshist record, @Param("example") OveralltranshistExample example);

    int updateByPrimaryKeySelective(Overalltranshist record);

    int updateByPrimaryKey(Overalltranshist record);
}