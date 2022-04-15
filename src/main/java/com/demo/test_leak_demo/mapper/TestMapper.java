package com.demo.test_leak_demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.test_leak_demo.bean.TestBean;

@Mapper
public interface TestMapper {
    List<TestBean> findAll();
}
