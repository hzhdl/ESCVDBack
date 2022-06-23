package com.escvd.main.controller;

import com.escvd.main.dao.SmartcontractMapper;
import com.escvd.main.dao.UserMapper;
import com.escvd.main.dao.UserscMapper;
import com.escvd.main.dao.VulnMapper;
import com.escvd.main.entity.*;
import com.escvd.main.service.Chart;
import com.escvd.main.service.GetDate;
import com.escvd.main.service.Hisinfo;
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
    public Result login(String name,String psd){
        UserDaoExample userDaoExample = new UserDaoExample();
        userDaoExample.setDistinct(false);
        UserDaoExample.Criteria criteria = userDaoExample.createCriteria();
        criteria.andUsernameEqualTo(name);
        List<UserDao> userDaos = userMapper.selectByExample(userDaoExample);
        if (userDaos.size()==1){
            if (userDaos.get(0).getPassword().equals(psd)){
                System.out.println(userDaos.get(0).getUserid().toString());
                return Result.success(userDaos.get(0),userDaos.get(0).getUserid().toString());
            }
            else {
                return Result.failure("密码或用户名错误");
            }
        }else {
            return Result.failure("用户不存在，请重新注册");
        }

    }
    @RequestMapping("/register")
    public Result register(String name,String psd) {
        int i=new Date().toString().hashCode();


        UserDaoExample userDaoExample = new UserDaoExample();
        userDaoExample.setDistinct(false);
        UserDaoExample.Criteria criteria = userDaoExample.createCriteria();
        criteria.andUsernameEqualTo(name);
        long l = userMapper.countByExample(userDaoExample);
        if (l!=0){
            return Result.failure("用户名已存在，请更改用户名");
        }
        UserDao ud = new UserDao(i,name,"test",psd);
        int user=userMapper.insert(ud);
        if (user==1){
            return Result.success("注册成功");
        }
        else {
            return Result.failure("注册失败，请重试");
        }
    }

    @RequestMapping("/Dcomplie")
    public Result Dcomplie(String userid,String scname,String ABI,String Code,String ByteCode,Integer flag){

        Integer id=Integer.parseInt(userid);
        //向usersc中添加数据
        int i = new Date().toString().hashCode();
        UserscDao userscDao = new UserscDao(id,String.valueOf(i));
        System.out.println(userscDao);

        userscMapper.insert(userscDao);

        //向SC中添加数据   这里的vulnid 为随机写的需要进一步的结合后期python脚本进行确定
        SmartcontractDao smartcontractDao = new SmartcontractDao(i,scname,ABI,Code,ByteCode,11,new Date());

        System.out.println(smartcontractDao);

        int ii=smartcontractMapper.insert(smartcontractDao);


        return Result.success(ii);
    }

    @RequestMapping("/complie")
    public Result complie(String userid,String scname,String ByteCode,Integer flag){
        System.out.println(ByteCode);

        Integer id=Integer.parseInt(userid);
        //向usersc中添加数据
        int i = new Date().toString().hashCode();
        UserscDao userscDao = new UserscDao(id,String.valueOf(i));
        System.out.println(userscDao);

        userscMapper.insert(userscDao);

        //向SC中添加数据   这里的vulnid 为随机写的需要进一步的结合后期python脚本进行确定
        SmartcontractDao smartcontractDao = new SmartcontractDao(i,scname,"test","test",ByteCode,11,new Date());

        System.out.println(smartcontractDao);

        int ii=smartcontractMapper.insert(smartcontractDao);


        return Result.success(ii);
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


    @RequestMapping("/hisinfo")
    //合约和时间
    public Result hisinfo(String id,String flag,Integer limit,Integer pages){
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM");
        Integer idd= Integer.parseInt(id);

        UserscDaoExample userscDaoExample = new UserscDaoExample();
        UserscDaoExample.Criteria criteria = userscDaoExample.createCriteria();
        criteria.andUseridEqualTo(idd);
        List<UserscDao> userscDaos = userscMapper.selectByExample(userscDaoExample);
        int length=userscDaos.size();
        int toindex=pages*limit;
        if (length<pages*limit){
            toindex=length;
        }
        userscDaos=userscDaos.subList((pages-1)*limit,toindex);

        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
//        System.out.println(userscDaos);
        //System.out.println(Integer.parseInt(userscDaos.get(0).getSmartcontractid())+"   "+userscDaos.get(0).getSmartcontractid());

        ArrayList<Hisinfo> hisinfos = new ArrayList<>();


        for (UserscDao item:userscDaos) {
            Hisinfo hisinfo = new Hisinfo(smartcontractMapper.selectByPrimaryKey(Integer.parseInt(item.getSmartcontractid())));
            hisinfo.setUsername(userMapper.selectByPrimaryKey(idd).getUsername());
            hisinfos.add(hisinfo);
        }



        return Result.success(hisinfos,length);
    }

    @RequestMapping("/chart3")
    //统计合约数和漏洞数
    public Result chart3(String id,String flag){
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM");
        Integer idd= Integer.parseInt(id);

        UserscDaoExample userscDaoExample = new UserscDaoExample();
        UserscDaoExample.Criteria criteria = userscDaoExample.createCriteria();
        criteria.andUseridEqualTo(idd);
        List<UserscDao> userscDaos = userscMapper.selectByExample(userscDaoExample);


        List<SmartcontractDao> smartcontractDaos = new ArrayList<SmartcontractDao>();

        for (UserscDao item:userscDaos) {
            smartcontractDaos.add(smartcontractMapper.selectByPrimaryKey(Integer.parseInt(item.getSmartcontractid())));
        }

        //初始化数据数组
        ArrayList<Integer> result=new ArrayList<>();
        result.add(0);
        int times = 0;

        for (SmartcontractDao item: smartcontractDaos) {
            int number = item.getVulnid();
            int count = 0;
            while (number > 0){
                if(number%2==1){
                    count++;
                }
                number = number / 2;
            }
            result.add(result.get(times)+count);
            times++;
        }
        //初始化结果
        Chart<Integer> integerChart = new Chart<Integer>();

        for (int i = 1; i < result.size(); i++) {

            integerChart.pushobject(result.get(i),Integer.toString(i));
        }


        return Result.success(integerChart);
    }

    @RequestMapping("/chart4")
    //统计不同类型漏洞的数量
    public Result chart4(String id,String flag){
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM");
        Integer idd= Integer.parseInt(id);

        UserscDaoExample userscDaoExample = new UserscDaoExample();
        UserscDaoExample.Criteria criteria = userscDaoExample.createCriteria();
        criteria.andUseridEqualTo(idd);
        List<UserscDao> userscDaos = userscMapper.selectByExample(userscDaoExample);


        List<SmartcontractDao> smartcontractDaos = new ArrayList<SmartcontractDao>();

        for (UserscDao item:userscDaos) {
            smartcontractDaos.add(smartcontractMapper.selectByPrimaryKey(Integer.parseInt(item.getSmartcontractid())));
        }

        //初始化数据数组
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<6;i++){
            result.add(0);
        }
        for (SmartcontractDao item: smartcontractDaos) {
            int number = item.getVulnid();
            int times = 0;
            while (number > 0){
                if(number%2==1){
                    result.set(5-times,result.get(5-times)+1);
                }
                number = number / 2;
                times++;
            }
        }
        return Result.success(result);
    }
}