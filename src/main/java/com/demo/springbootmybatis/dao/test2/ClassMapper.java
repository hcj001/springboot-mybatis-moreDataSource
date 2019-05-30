package com.demo.springbootmybatis.dao.test2;

import com.demo.springbootmybatis.entity.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ClassMapper {
    Classes getClass(@Param("id") Integer id);
    Classes getClass2(@Param("id") Integer id);
    Classes getClass3(@Param("id") Integer id);
}
