package com.demo.springbootmybatis.dao.test1;


import com.demo.springbootmybatis.entity.DangerWork;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DangerWorkMapper {

    DangerWork getDangerWorkById(Integer id);

}
