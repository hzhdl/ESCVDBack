package com.escvd.main.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.*;

@Service
@Setter
@Getter
public class GetDate {


    public static ArrayList<Date> getAllTopicYesterdayUpload() {
        ArrayList<Date> dates = new ArrayList<>();
        //取时间
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        //设置时间
        calendar.setTime(date);
        //天数减1
        calendar.add( Calendar.YEAR,-6);
        calendar.set(Calendar.HOUR,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        //获取开始时间，为昨天开始时间
        Date beginDate = calendar.getTime();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        calendar.set(Calendar.MILLISECOND,999);
        //获取结束时间，为昨天最后时间，精确到毫秒级别
        Date endDate = calendar.getTime();

        dates.add(beginDate);
        dates.add(endDate);

        return dates;
    }
}
