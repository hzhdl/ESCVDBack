package com.escvd.main.dao;

import com.escvd.main.entity.UserDao;
import com.escvd.main.entity.UserDaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
    long countByExample(UserDaoExample example);

    int deleteByExample(UserDaoExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(UserDao record);

    int insertSelective(UserDao record);

    List<UserDao> selectByExample(UserDaoExample example);

    UserDao selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") UserDao record, @Param("example") UserDaoExample example);

    int updateByExample(@Param("record") UserDao record, @Param("example") UserDaoExample example);

    int updateByPrimaryKeySelective(UserDao record);

    int updateByPrimaryKey(UserDao record);
}