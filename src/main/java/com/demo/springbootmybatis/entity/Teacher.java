package com.demo.springbootmybatis.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {
    private int id;
    private String name;

}
