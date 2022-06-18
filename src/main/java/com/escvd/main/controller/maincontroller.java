package com.escvd.main.controller;

import com.escvd.main.dao.SmartcontractMapper;
import com.escvd.main.dao.UserMapper;
import com.escvd.main.dao.UserscMapper;
import com.escvd.main.dao.VulnMapper;
import com.escvd.main.entity.*;
import com.escvd.main.service.Chart;
import com.escvd.main.service.GetDate;
import com.escvd.main.service.Result;
import com.sun.javafx.collections.MappingChange;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

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

        UserDaoExample userDaoExample = new UserDaoExample();
        userDaoExample.setDistinct(false);
        UserDaoExample.Criteria criteria = userDaoExample.createCriteria();
        criteria.andUseridEqualTo(123);

        List<UserDao> userDaos = userMapper.selectByExample(userDaoExample);

        System.out.println(userDaos);

        return Result.success(userDaos);
    }

    @RequestMapping("/chart1")
    //合约和时间
    public Result chart1(){
        Integer id=2;
        Chart<Map<String,String>> chart=new Chart<>();


        UserDao userDao=userMapper.selectByPrimaryKey(id);

        UserscDaoExample userscDaoExample = new UserscDaoExample();
        UserscDaoExample.Criteria criteria = userscDaoExample.createCriteria();
        criteria.andUseridEqualTo(id);
        List<UserscDao> userscDaos = userscMapper.selectByExample(userscDaoExample);

        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        System.out.println(userscDaos);
        //System.out.println(Integer.parseInt(userscDaos.get(0).getSmartcontractid())+"   "+userscDaos.get(0).getSmartcontractid());

        for (UserscDao item:userscDaos) {
            SmartcontractDaoExample smartcontractDaoExample = new SmartcontractDaoExample();
            SmartcontractDaoExample.Criteria criteria1 = smartcontractDaoExample.createCriteria();
            ArrayList<Date> allTopicYesterdayUpload = GetDate.getAllTopicYesterdayUpload();

            criteria1.andSmartcontractidEqualTo(Integer.parseInt(item.getSmartcontractid()));
            criteria1.andTimestampBetween(allTopicYesterdayUpload.get(0), allTopicYesterdayUpload.get(1));

            long l = smartcontractMapper.countByExample(smartcontractDaoExample);
            System.out.println(l);
//            chart.pushobject(new Map<String,String>());
        }

        return Result.success(userscDaos);
    }

}
