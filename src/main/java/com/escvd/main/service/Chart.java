package com.escvd.main.service;

import com.escvd.main.dao.SmartcontractMapper;
import com.escvd.main.entity.SmartcontractDao;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
public class Chart<T> {
    List<T> t;

    public void pushobject(T tt){
        t.add(tt);
    }
}
