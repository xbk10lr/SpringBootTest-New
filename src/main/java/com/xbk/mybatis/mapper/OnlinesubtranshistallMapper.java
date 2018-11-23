package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Onlinesubtranshistall;
import com.xbk.mybatis.model.OnlinesubtranshistallExample;
import com.xbk.mybatis.model.OnlinesubtranshistallKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinesubtranshistallMapper {
    long countByExample(OnlinesubtranshistallExample example);

    int deleteByExample(OnlinesubtranshistallExample example);

    int deleteByPrimaryKey(OnlinesubtranshistallKey key);

    int insert(Onlinesubtranshistall record);

    int insertSelective(Onlinesubtranshistall record);

    List<Onlinesubtranshistall> selectByExample(OnlinesubtranshistallExample example);

    Onlinesubtranshistall selectByPrimaryKey(OnlinesubtranshistallKey key);

    int updateByExampleSelective(@Param("record") Onlinesubtranshistall record, @Param("example") OnlinesubtranshistallExample example);

    int updateByExample(@Param("record") Onlinesubtranshistall record, @Param("example") OnlinesubtranshistallExample example);

    int updateByPrimaryKeySelective(Onlinesubtranshistall record);

    int updateByPrimaryKey(Onlinesubtranshistall record);
}