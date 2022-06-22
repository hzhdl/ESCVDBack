package com.escvd.main.dao;

import com.escvd.main.entity.SmartcontractDao;
import com.escvd.main.entity.SmartcontractDaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SmartcontractMapper {
    long countByExample(SmartcontractDaoExample example);

    int deleteByExample(SmartcontractDaoExample example);

    int deleteByPrimaryKey(Integer smartcontractid);

    int insert(SmartcontractDao record);

    int insertSelective(SmartcontractDao record);

    List<SmartcontractDao> selectByExample(SmartcontractDaoExample example);

    SmartcontractDao selectByPrimaryKey(Integer smartcontractid);

    int updateByExampleSelective(@Param("record") SmartcontractDao record, @Param("example") SmartcontractDaoExample example);

    int updateByExample(@Param("record") SmartcontractDao record, @Param("example") SmartcontractDaoExample example);

    int updateByPrimaryKeySelective(SmartcontractDao record);

    int updateByPrimaryKey(SmartcontractDao record);
}