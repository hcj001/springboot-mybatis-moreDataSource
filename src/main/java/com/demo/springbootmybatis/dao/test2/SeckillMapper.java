package com.demo.springbootmybatis.dao.test2;

import com.demo.springbootmybatis.entity.Seckill;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SeckillMapper {

    Seckill queryById(long id);

}
