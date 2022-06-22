package com.escvd.main.entity;

import java.util.Date;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class SmartcontractDao {
    private Integer smartcontractid;

    private String abi;

    private String code;

    private String bytecode;

    private Integer vulnid;

    private Date timestamp;


}