package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Onlinesubtrans;
import com.xbk.mybatis.model.OnlinesubtransExample;
import com.xbk.mybatis.model.OnlinesubtransKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinesubtransMapper {
    long countByExample(OnlinesubtransExample example);

    int deleteByExample(OnlinesubtransExample example);

    int deleteByPrimaryKey(OnlinesubtransKey key);

    int insert(Onlinesubtrans record);

    int insertSelective(Onlinesubtrans record);

    List<Onlinesubtrans> selectByExample(OnlinesubtransExample example);

    Onlinesubtrans selectByPrimaryKey(OnlinesubtransKey key);

    int updateByExampleSelective(@Param("record") Onlinesubtrans record, @Param("example") OnlinesubtransExample example);

    int updateByExample(@Param("record") Onlinesubtrans record, @Param("example") OnlinesubtransExample example);

    int updateByPrimaryKeySelective(Onlinesubtrans record);

    int updateByPrimaryKey(Onlinesubtrans record);
}