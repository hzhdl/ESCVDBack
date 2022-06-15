package com.escvd.main.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserscDao {
    private Integer userid;

    private String smartcontractid;
}