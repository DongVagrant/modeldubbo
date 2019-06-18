package com.wd.modeldubbo.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService {
    @Override
    public String testService() {
        return "Test";
    }
}
