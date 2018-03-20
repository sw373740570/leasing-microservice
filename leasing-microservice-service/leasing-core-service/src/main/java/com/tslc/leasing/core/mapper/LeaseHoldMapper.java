package com.tslc.leasing.core.mapper;

import com.tslc.leasing.core.model.LeaseHold;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface LeaseHoldMapper {

    int insert(LeaseHold leaseHold);

    List<LeaseHold> getList();
}
