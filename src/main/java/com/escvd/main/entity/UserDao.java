package com.escvd.main.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class UserDao {
    private Integer userid;

    private String username;

    private String detail;

    private String password;
}