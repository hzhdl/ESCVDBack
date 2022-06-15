package com.escvd.main.controller;

import com.escvd.main.dao.SmartcontractMapper;
import com.escvd.main.dao.UserMapper;
import com.escvd.main.dao.UserscMapper;
import com.escvd.main.dao.VulnMapper;
import com.escvd.main.entity.UserDao;
import com.escvd.main.entity.UserDaoExample;
import com.escvd.main.service.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableSwagger2
public class maincontroller {

    @Resource
    public SmartcontractMapper smartcontractMapper;

    @Resource
    public UserMapper userMapper;

    @Resource
    public UserscMapper userscMapper;

    @Resource
    public VulnMapper vulnMapper;

    @RequestMapping("/login")
    public Result login(){
        Result result = new Result();
        UserDaoExample userDaoExample = new UserDaoExample();
        userDaoExample.setDistinct(false);
        UserDaoExample.Criteria criteria = userDaoExample.createCriteria();
        criteria.andUseridEqualTo(123);

        List<UserDao> userDaos = userMapper.selectByExample(userDaoExample);
        System.out.println(userDaos);

        return Result.success(userDaos);
    }

}
