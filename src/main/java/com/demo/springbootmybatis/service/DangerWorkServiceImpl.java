package com.demo.springbootmybatis.service;

import com.demo.springbootmybatis.dao.test1.DangerWorkMapper;
import com.demo.springbootmybatis.entity.DangerWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DangerWorkServiceImpl implements DangerWorkservice {

    @Autowired
    DangerWorkMapper dangerWorkMapper;
    @Override
    public DangerWork getDangerWorkById(Integer id) {
        return dangerWorkMapper.getDangerWorkById(id);
    }
}
