package com.escvd.main.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class VulnDao {
    private Integer vulnid;

    private String vulnname;

    private String vulndetail;
}