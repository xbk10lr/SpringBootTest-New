package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Onlinesubtranshist;
import com.xbk.mybatis.model.OnlinesubtranshistExample;
import com.xbk.mybatis.model.OnlinesubtranshistKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinesubtranshistMapper {
    long countByExample(OnlinesubtranshistExample example);

    int deleteByExample(OnlinesubtranshistExample example);

    int deleteByPrimaryKey(OnlinesubtranshistKey key);

    int insert(Onlinesubtranshist record);

    int insertSelective(Onlinesubtranshist record);

    List<Onlinesubtranshist> selectByExample(OnlinesubtranshistExample example);

    Onlinesubtranshist selectByPrimaryKey(OnlinesubtranshistKey key);

    int updateByExampleSelective(@Param("record") Onlinesubtranshist record, @Param("example") OnlinesubtranshistExample example);

    int updateByExample(@Param("record") Onlinesubtranshist record, @Param("example") OnlinesubtranshistExample example);

    int updateByPrimaryKeySelective(Onlinesubtranshist record);

    int updateByPrimaryKey(Onlinesubtranshist record);
}