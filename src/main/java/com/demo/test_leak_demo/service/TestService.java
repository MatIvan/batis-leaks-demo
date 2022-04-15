package com.demo.test_leak_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.test_leak_demo.bean.TestBean;
import com.demo.test_leak_demo.mapper.TestMapper;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public void startTest(Integer count) {
        long startTimeAllRequest = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            System.out.println("Request number: " + (i + 1));
            long startTimeRequest = System.currentTimeMillis();
            List<TestBean> list = testMapper.findAll();
            long finishTimeRequest = System.currentTimeMillis();
            System.out.println("\tCount records: " + list.size());
            System.out.println("\tTime current request: " + (finishTimeRequest - startTimeRequest) + " ms.");
        }
        long finishTimeAllRequest = System.currentTimeMillis();
        System.out.println("\tTime all request: " + (finishTimeAllRequest - startTimeAllRequest) + " ms.");
    }
}
