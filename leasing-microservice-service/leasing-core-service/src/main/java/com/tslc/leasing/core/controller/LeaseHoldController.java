package com.tslc.leasing.core.controller;

import com.tslc.leasing.core.service.LeaseHoldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("core/leaseHold")
public class LeaseHoldController {

    private final static Logger logger = LoggerFactory.getLogger(LeaseHoldController.class);

    @Autowired
    private LeaseHoldService leaseHoldService;

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public Map<String, Object> getList(){
        logger.info("/getList");
        Map<String, Object> jsonObject = new HashMap<>();
        jsonObject.put("result",leaseHoldService.getList());
        return jsonObject;
    }

}
