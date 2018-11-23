package com.xbk.mybatis.mapper;

import com.xbk.mybatis.model.Innerfundtrans;
import com.xbk.mybatis.model.InnerfundtransExample;
import com.xbk.mybatis.model.InnerfundtransKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnerfundtransMapper {
    long countByExample(InnerfundtransExample example);

    int deleteByExample(InnerfundtransExample example);

    int deleteByPrimaryKey(InnerfundtransKey key);

    int insert(Innerfundtrans record);

    int insertSelective(Innerfundtrans record);

    List<Innerfundtrans> selectByExample(InnerfundtransExample example);

    Innerfundtrans selectByPrimaryKey(InnerfundtransKey key);

    int updateByExampleSelective(@Param("record") Innerfundtrans record, @Param("example") InnerfundtransExample example);

    int updateByExample(@Param("record") Innerfundtrans record, @Param("example") InnerfundtransExample example);

    int updateByPrimaryKeySelective(Innerfundtrans record);

    int updateByPrimaryKey(Innerfundtrans record);
}