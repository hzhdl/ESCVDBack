package com.escvd.main.service;

import com.escvd.main.entity.SmartcontractDao;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Date;

@Getter
@Setter
public class Hisinfo extends SmartcontractDao{
    private String Username;


    public Hisinfo(SmartcontractDao smartcontractDao) {
        super(smartcontractDao);
    }
}
