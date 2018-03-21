package com.tslc.leasing.core.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tslc.leasing.core.service.LeaseHoldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("core/leaseHold")
@RefreshScope
public class LeaseHoldController {

    private final static Logger logger = LoggerFactory.getLogger(LeaseHoldController.class);

    @Value("${testStr}")
    private String testStr;

    @Autowired
    private LeaseHoldService leaseHoldService;

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public Map<String, Object> getList(){
        logger.info("/getList");
        Map<String, Object> jsonObject = new HashMap<>();
        jsonObject.put("result",leaseHoldService.getList());
        return jsonObject;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return testStr;
    }

    public Map<String, Object> fallback(){
        Map<String, Object> result = new HashMap<>();
        result.put("result","fallback");
        return result;
    }
}
