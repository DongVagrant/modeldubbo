package com.wd.modeldubbo.controller;

import com.wd.modeldubbo.common.pojo.Result;
import com.wd.modeldubbo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping("/testOne")
    @ResponseBody
    public Result testOne(){
        return new Result(testService.testService());
    }
}
