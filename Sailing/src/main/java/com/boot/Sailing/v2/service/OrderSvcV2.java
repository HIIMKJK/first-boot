package com.boot.Sailing.v2.service;

import com.boot.Sailing.v2.dao.OrderDaoV2;
import com.boot.Sailing.v2.vo.Order_list;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class OrderSvcV2 {

    @Autowired
    OrderDaoV2 orderDaoV2;

    public List<Order_list> doList() {
        List<Order_list> list = orderDaoV2.doList();
        return list;
    }

    public List<Order_list> doSearch(String strStartDate, String strEndDate, String strCoffee, String strName) {
        List<Order_list> list = orderDaoV2.doSearch(strStartDate, strEndDate, strCoffee, strName);
        return list;
    }
}
