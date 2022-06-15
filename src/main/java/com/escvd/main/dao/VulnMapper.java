package com.escvd.main.dao;

import com.escvd.main.entity.VulnDao;
import com.escvd.main.entity.VulnDaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VulnMapper {
    long countByExample(VulnDaoExample example);

    int deleteByExample(VulnDaoExample example);

    int deleteByPrimaryKey(Integer vulnid);

    int insert(VulnDao record);

    int insertSelective(VulnDao record);

    List<VulnDao> selectByExample(VulnDaoExample example);

    VulnDao selectByPrimaryKey(Integer vulnid);

    int updateByExampleSelective(@Param("record") VulnDao record, @Param("example") VulnDaoExample example);

    int updateByExample(@Param("record") VulnDao record, @Param("example") VulnDaoExample example);

    int updateByPrimaryKeySelective(VulnDao record);

    int updateByPrimaryKey(VulnDao record);
}