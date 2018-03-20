package com.tslc.leasing.core.service;

import com.tslc.leasing.core.mapper.LeaseHoldMapper;
import com.tslc.leasing.core.model.LeaseHold;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaseHoldService {

    @Autowired
    private LeaseHoldMapper leaseHoldMapper;

    public List<LeaseHold> getList() {
        return leaseHoldMapper.getList();
    }
}
