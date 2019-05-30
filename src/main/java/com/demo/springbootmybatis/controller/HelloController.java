package com.demo.springbootmybatis.controller;

import com.demo.springbootmybatis.dao.test2.ClassMapper;
import com.demo.springbootmybatis.dao.test2.SeckillMapper;
import com.demo.springbootmybatis.entity.Classes;
import com.demo.springbootmybatis.entity.DangerWork;
import com.demo.springbootmybatis.entity.Seckill;
import com.demo.springbootmybatis.service.DangerWorkservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class HelloController {
    public static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    DangerWorkservice dangerWorkservice;
    @Autowired
    SeckillMapper seckillMapper;
    @Autowired
    ClassMapper classMapper;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world!";
    }

    @RequestMapping("/test1")
    @ResponseBody
    public DangerWork test () {
        return dangerWorkservice.getDangerWorkById(15);
    }

    @RequestMapping("/test2")
    @ResponseBody
    public Seckill queryById() {
        return seckillMapper.queryById(1000);
    }
    @RequestMapping("/testOneToOne")
    @ResponseBody
    public Classes getClass(Integer id) {
        return classMapper.getClass(id);
    }
    @RequestMapping("/testOneToOne2")
    @ResponseBody
    public Classes getClass2(Integer id) {
        System.out.println(classMapper.getClass2(id));
        System.out.println(classMapper.getClass(id));
        return classMapper.getClass2(id);
    }
    @RequestMapping("/testOneToMany")
    @ResponseBody
    public Classes getClass3(Integer id) {
        return classMapper.getClass3(id);
    }
}
