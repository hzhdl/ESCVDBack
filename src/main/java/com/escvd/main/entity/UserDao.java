package com.escvd.main.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDao {
    private Integer userid;

    private String username;

    private String detail;

    private String password;
}