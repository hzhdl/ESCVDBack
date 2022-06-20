package com.escvd.main.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Setter
@Getter
public class GetDate {

    private static SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //获取最近六个月的日期信息
    public static ArrayList<Date> getpasthalfyear() {
        //最近六个月的数据列表

        ArrayList<Date> dates = new ArrayList<>();

        for (int i = 5; i >=0; i--) {
//            System.out.println(s.format(getMonthbegindata(-i)));
//            System.out.println(s.format(getMonthenddata(-i+1)));
            dates.add(getMonthbegindata(-i));
            dates.add(getMonthenddata(-i+1));
        }




        return dates;
    }

    public static Date getMonthbegindata(Integer num){
        Calendar cal_1=Calendar.getInstance();//获取当前日期
        cal_1.add(Calendar.MONTH, num);
        cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        cal_1.set(Calendar.HOUR_OF_DAY,0);
        cal_1.set(Calendar.MINUTE,0);
        cal_1.set(Calendar.SECOND,0);

        return cal_1.getTime();
//        String firstDay = s.format(cal_1.getTime());
//        System.out.println("-----1------firstDay:"+firstDay);
    }
    public static Date getMonthenddata(Integer num){
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, num);
        cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天
        cale.set(Calendar.HOUR_OF_DAY,23);
        cale.set(Calendar.MINUTE,59);
        cale.set(Calendar.SECOND,59);

        return cale.getTime();
//        String lastDay = s.format(cale.getTime());
//        System.out.println("-----2------lastDay:"+lastDay);
    }
}
