package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Innerfundtranshistall;
import com.xbk.mybatis.model.InnerfundtranshistallExample;
import com.xbk.mybatis.model.InnerfundtranshistallKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnerfundtranshistallMapper {
    long countByExample(InnerfundtranshistallExample example);

    int deleteByExample(InnerfundtranshistallExample example);

    int deleteByPrimaryKey(InnerfundtranshistallKey key);

    int insert(Innerfundtranshistall record);

    int insertSelective(Innerfundtranshistall record);

    List<Innerfundtranshistall> selectByExample(InnerfundtranshistallExample example);

    Innerfundtranshistall selectByPrimaryKey(InnerfundtranshistallKey key);

    int updateByExampleSelective(@Param("record") Innerfundtranshistall record, @Param("example") InnerfundtranshistallExample example);

    int updateByExample(@Param("record") Innerfundtranshistall record, @Param("example") InnerfundtranshistallExample example);

    int updateByPrimaryKeySelective(Innerfundtranshistall record);

    int updateByPrimaryKey(Innerfundtranshistall record);
}