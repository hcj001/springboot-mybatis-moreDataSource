package com.demo.springbootmybatis;

import com.demo.springbootmybatis.dao.test1.DangerWorkMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    DangerWorkMapper dangerWOrkMapper;
    @Test
    public void contextLoads() {
        System.out.println(dangerWOrkMapper.getDangerWorkById(1));
    }

}
