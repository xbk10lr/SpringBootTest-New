package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Onlineorderinfo;
import com.xbk.mybatis.model.OnlineorderinfoExample;
import com.xbk.mybatis.model.OnlineorderinfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlineorderinfoMapper {
    long countByExample(OnlineorderinfoExample example);

    int deleteByExample(OnlineorderinfoExample example);

    int deleteByPrimaryKey(OnlineorderinfoKey key);

    int insert(Onlineorderinfo record);

    int insertSelective(Onlineorderinfo record);

    List<Onlineorderinfo> selectByExample(OnlineorderinfoExample example);

    Onlineorderinfo selectByPrimaryKey(OnlineorderinfoKey key);

    int updateByExampleSelective(@Param("record") Onlineorderinfo record, @Param("example") OnlineorderinfoExample example);

    int updateByExample(@Param("record") Onlineorderinfo record, @Param("example") OnlineorderinfoExample example);

    int updateByPrimaryKeySelective(Onlineorderinfo record);

    int updateByPrimaryKey(Onlineorderinfo record);
}