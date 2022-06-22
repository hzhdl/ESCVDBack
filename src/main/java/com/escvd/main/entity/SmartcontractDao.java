package com.escvd.main.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class SmartcontractDao {
    private Integer smartcontractid;

    private String smartcontractname;

    private String abi;

    private String code;

    private String bytecode;

    private Integer vulnid;

    private Date timestamp;

    public SmartcontractDao(SmartcontractDao smartcontractDao){
        this.setSmartcontractname(smartcontractDao.getSmartcontractname());
        this.setAbi(smartcontractDao.getAbi());
        this.setBytecode(smartcontractDao.getBytecode());
        this.setCode(smartcontractDao.getCode());
        this.setSmartcontractid(smartcontractDao.getSmartcontractid());
        this.setTimestamp(smartcontractDao.getTimestamp());
        this.setVulnid(smartcontractDao.getVulnid());
    }
}