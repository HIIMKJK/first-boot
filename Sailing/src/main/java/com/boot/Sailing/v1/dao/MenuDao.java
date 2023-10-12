package com.boot.Sailing.v1.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface MenuDao {

    List<Map<String, Object>> doList();

    int doInsert(String strCoffee, String strKind, String strPrice);

    int doDelete(String strNo);

    // One row 조회
    Map<String, Object> doListOne(String strNo);

    // Update
    int doUpdate(String strNo, String strCoffee, String strKind, String strPrice);

    List<Map<String, Object>> doSerch(String strStartDate, String strEndDate, String strCoffee, String strKind);

    int doUpdatePrice(String strNo, String strPrice);

    int doInsertLog(String strNo, String strPrice);
}
