package com.escvd.main.service;

import com.escvd.main.dao.SmartcontractMapper;
import com.escvd.main.entity.SmartcontractDao;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@Setter
public class Chart<T> {
    private ArrayList<T> data=new ArrayList<T>();
    private ArrayList<String> xtext =new ArrayList<String>();

    public void pushobject(T tt,String x){
        data.add(tt);
        xtext.add(x);
    }
}
