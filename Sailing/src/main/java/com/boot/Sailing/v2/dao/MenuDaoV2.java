package com.boot.Sailing.v2.dao;

import com.boot.Sailing.v2.vo.Coffee_menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface MenuDaoV2 {

    List<Coffee_menu> doList();

    int doInsert(Coffee_menu coffeeMenu);

    int doDelete(String strNo);

    // One row 조회
    Map<String, Object> doListOne(String strNo);

    // Update
    int doUpdate(Coffee_menu coffeeMenu);

    List<Coffee_menu> doSerch(String strStartDate, String strEndDate, String strCoffee, String strKind);

    int doUpdatePrice(String strNo, String strPrice);

    int doInsertLog(String strNo, String strPrice);
}
