package com.escvd.main.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VulnDao {
    private Integer vulnid;

    private String vulnname;

    private String vulndetail;
}