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
import io.swagger.models.auth.In;
import javafx.beans.binding.MapBinding;
import javafx.collections.ObservableMap;
import org.apache.ibatis.jdbc.Null;
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
    public Result chart1(String id,String flag){
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM");
        Integer idd= Integer.parseInt(id);

        UserscDaoExample userscDaoExample = new UserscDaoExample();
        UserscDaoExample.Criteria criteria = userscDaoExample.createCriteria();
        criteria.andUseridEqualTo(idd);
        List<UserscDao> userscDaos = userscMapper.selectByExample(userscDaoExample);

        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
//        System.out.println(userscDaos);
        //System.out.println(Integer.parseInt(userscDaos.get(0).getSmartcontractid())+"   "+userscDaos.get(0).getSmartcontractid());
        List<SmartcontractDao> smartcontractDaos = new ArrayList<SmartcontractDao>();

        for (UserscDao item:userscDaos) {
            smartcontractDaos.add(smartcontractMapper.selectByPrimaryKey(Integer.parseInt(item.getSmartcontractid())));
        }

        //获取时间列表
        ArrayList<Date> getpasthalfyear = GetDate.getpasthalfyear();
        //初始化数据数组
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            result.add(0);
        }
        for (SmartcontractDao item: smartcontractDaos) {
            if (item.getTimestamp().after(getpasthalfyear.get(0))&&item.getTimestamp().before(getpasthalfyear.get(1))){
                result.set(0, result.get(0)+1);
            }else if(item.getTimestamp().after(getpasthalfyear.get(2))&&item.getTimestamp().before(getpasthalfyear.get(3))){
                result.set(1,result.get(1)+1);
            }else if(item.getTimestamp().after(getpasthalfyear.get(4))&&item.getTimestamp().before(getpasthalfyear.get(5))){
                result.set(2,result.get(2)+1);
            }else if(item.getTimestamp().after(getpasthalfyear.get(6))&&item.getTimestamp().before(getpasthalfyear.get(7))){
                result.set(3,result.get(3)+1);
            }else if(item.getTimestamp().after(getpasthalfyear.get(8))&&item.getTimestamp().before(getpasthalfyear.get(9))){
                result.set(4,result.get(4)+1);
            }else if(item.getTimestamp().after(getpasthalfyear.get(10))&&item.getTimestamp().before(getpasthalfyear.get(11))){

                result.set(5,result.get(5)+1);
            }
        }
        //初始化结果
        Chart<Integer> integerChart = new Chart<Integer>();

        for (int i = 0; i < 6; i++) {

            integerChart.pushobject(result.get(i),s.format(getpasthalfyear.get(i*2)));
        }


        return Result.success(integerChart);
    }

    @RequestMapping("/chart2")
    //合约和时间
    public Result chart2(String id,String flag){
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM");
        Integer idd= Integer.parseInt(id);

        UserscDaoExample userscDaoExample = new UserscDaoExample();
        UserscDaoExample.Criteria criteria = userscDaoExample.createCriteria();
        criteria.andUseridEqualTo(idd);
        List<UserscDao> userscDaos = userscMapper.selectByExample(userscDaoExample);

        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
//        System.out.println(userscDaos);
        //System.out.println(Integer.parseInt(userscDaos.get(0).getSmartcontractid())+"   "+userscDaos.get(0).getSmartcontractid());
        List<SmartcontractDao> smartcontractDaos = new ArrayList<SmartcontractDao>();

        for (UserscDao item:userscDaos) {
            smartcontractDaos.add(smartcontractMapper.selectByPrimaryKey(Integer.parseInt(item.getSmartcontractid())));
        }

        //获取时间列表
        ArrayList<Date> getpasthalfyear = GetDate.getpasthalfyear();
        //初始化数据数组
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            result.add(0);
        }

        for (SmartcontractDao item: smartcontractDaos) {
            if (item.getTimestamp().after(getpasthalfyear.get(0))&&item.getTimestamp().before(getpasthalfyear.get(1))){
                int number = item.getVulnid();
                while (number > 0){
                    if(number%2==1){
                        result.set(0, result.get(0)+1);
                    }
                    number = number / 2;
                }
            }else if(item.getTimestamp().after(getpasthalfyear.get(2))&&item.getTimestamp().before(getpasthalfyear.get(3))){
                int number = item.getVulnid();
                while (number > 0){
                    if(number%2==1){
                        result.set(1,result.get(1)+1);
                    }
                    number = number / 2;
                }
            }else if(item.getTimestamp().after(getpasthalfyear.get(4))&&item.getTimestamp().before(getpasthalfyear.get(5))){
                int number = item.getVulnid();
                while (number > 0){
                    if(number%2==1){
                        result.set(2,result.get(2)+1);
                    }
                    number = number / 2;
                }
            }else if(item.getTimestamp().after(getpasthalfyear.get(6))&&item.getTimestamp().before(getpasthalfyear.get(7))){
                int number = item.getVulnid();
                while (number > 0){
                    if(number%2==1){
                        result.set(3,result.get(3)+1);
                    }
                    number = number / 2;
                }
            }else if(item.getTimestamp().after(getpasthalfyear.get(8))&&item.getTimestamp().before(getpasthalfyear.get(9))){
                int number = item.getVulnid();
                while (number > 0){
                    if(number%2==1){
                        result.set(4,result.get(4)+1);
                    }
                    number = number / 2;
                }
            }else if(item.getTimestamp().after(getpasthalfyear.get(10))&&item.getTimestamp().before(getpasthalfyear.get(11))){
                int number = item.getVulnid();
                while (number > 0){
                    if(number%2==1){
                        result.set(5,result.get(5)+1);
                    }
                    number = number / 2;
                }
            }
        }
        //初始化结果
        Chart<Integer> integerChart = new Chart<Integer>();

        for (int i = 0; i < 6; i++) {

            integerChart.pushobject(result.get(i),s.format(getpasthalfyear.get(i*2)));
        }


        return Result.success(integerChart);
    }

}