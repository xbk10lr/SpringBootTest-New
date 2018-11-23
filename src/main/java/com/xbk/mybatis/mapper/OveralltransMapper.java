package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Overalltrans;
import com.xbk.mybatis.model.OveralltransExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OveralltransMapper {
    long countByExample(OveralltransExample example);

    int deleteByExample(OveralltransExample example);

    int deleteByPrimaryKey(String overalltransnbr);

    int insert(Overalltrans record);

    int insertSelective(Overalltrans record);

    List<Overalltrans> selectByExample(OveralltransExample example);

    Overalltrans selectByPrimaryKey(String overalltransnbr);

    int updateByExampleSelective(@Param("record") Overalltrans record, @Param("example") OveralltransExample example);

    int updateByExample(@Param("record") Overalltrans record, @Param("example") OveralltransExample example);

    int updateByPrimaryKeySelective(Overalltrans record);

    int updateByPrimaryKey(Overalltrans record);
}