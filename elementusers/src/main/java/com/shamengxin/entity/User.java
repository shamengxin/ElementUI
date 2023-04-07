package com.shamengxin.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String id;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date bir;
    private String sex;
    private String address;
}
