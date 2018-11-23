package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Innerfundtranshist;
import com.xbk.mybatis.model.InnerfundtranshistExample;
import com.xbk.mybatis.model.InnerfundtranshistKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnerfundtranshistMapper {
    long countByExample(InnerfundtranshistExample example);

    int deleteByExample(InnerfundtranshistExample example);

    int deleteByPrimaryKey(InnerfundtranshistKey key);

    int insert(Innerfundtranshist record);

    int insertSelective(Innerfundtranshist record);

    List<Innerfundtranshist> selectByExample(InnerfundtranshistExample example);

    Innerfundtranshist selectByPrimaryKey(InnerfundtranshistKey key);

    int updateByExampleSelective(@Param("record") Innerfundtranshist record, @Param("example") InnerfundtranshistExample example);

    int updateByExample(@Param("record") Innerfundtranshist record, @Param("example") InnerfundtranshistExample example);

    int updateByPrimaryKeySelective(Innerfundtranshist record);

    int updateByPrimaryKey(Innerfundtranshist record);
}