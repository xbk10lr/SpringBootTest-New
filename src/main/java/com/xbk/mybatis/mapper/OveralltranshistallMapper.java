package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Overalltranshistall;
import com.xbk.mybatis.model.OveralltranshistallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OveralltranshistallMapper {
    long countByExample(OveralltranshistallExample example);

    int deleteByExample(OveralltranshistallExample example);

    int deleteByPrimaryKey(String overalltransnbr);

    int insert(Overalltranshistall record);

    int insertSelective(Overalltranshistall record);

    List<Overalltranshistall> selectByExample(OveralltranshistallExample example);

    Overalltranshistall selectByPrimaryKey(String overalltransnbr);

    int updateByExampleSelective(@Param("record") Overalltranshistall record, @Param("example") OveralltranshistallExample example);

    int updateByExample(@Param("record") Overalltranshistall record, @Param("example") OveralltranshistallExample example);

    int updateByPrimaryKeySelective(Overalltranshistall record);

    int updateByPrimaryKey(Overalltranshistall record);
}