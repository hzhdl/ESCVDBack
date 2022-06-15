package com.escvd.main.dao;

import com.escvd.main.entity.UserscDao;
import com.escvd.main.entity.UserscDaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserscMapper {
    long countByExample(UserscDaoExample example);

    int deleteByExample(UserscDaoExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(UserscDao record);

    int insertSelective(UserscDao record);

    List<UserscDao> selectByExample(UserscDaoExample example);

    UserscDao selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") UserscDao record, @Param("example") UserscDaoExample example);

    int updateByExample(@Param("record") UserscDao record, @Param("example") UserscDaoExample example);

    int updateByPrimaryKeySelective(UserscDao record);

    int updateByPrimaryKey(UserscDao record);
}