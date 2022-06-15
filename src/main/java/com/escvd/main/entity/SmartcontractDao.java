package com.escvd.main.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmartcontractDao {
    private Integer smartcontractid;

    private String abi;

    private String code;

    private String bytecode;

    private Integer vulnid;

    private Date timestamp;
}