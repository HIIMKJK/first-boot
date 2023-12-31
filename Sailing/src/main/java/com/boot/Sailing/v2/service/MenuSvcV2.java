package com.boot.Sailing.v2.service;


import com.boot.Sailing.v2.dao.MenuDaoV2;
import com.boot.Sailing.v2.vo.Coffee_menu;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Log4j2
public class MenuSvcV2 {

    @Autowired
    MenuDaoV2 menuDao;

    public MenuSvcV2() {
        log.info("============== MenuSvc, 생성자 ============");
    }

    public List<Coffee_menu> doList(){
        List<Coffee_menu> list = menuDao.doList();

        log.info(list);

        return list;
    }

    public List<Map<String, Object>> doListOld(){
        //Data 만들기 , List , Map
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("No","1");
        map.put("name","아이스아메");
        map.put("kind","커피");
        map.put("price", "5,000");
        map.put("reg_day","2020.10.29");
        map.put("mod_day","2021.10.29");
        list.add(map);

        Map<String, Object> map2 = new HashMap<>();

        map2.put("No","2");
        map2.put("name","카푸치노");
        map2.put("kind","커피");
        map2.put("price", "6,000");
        map2.put("reg_day","2020.10.29");
        map2.put("mod_day","2021.10.29");
        list.add(map2);

        Map<String, Object> map3 = new HashMap<>();

        map3.put("No","3");
        map3.put("name","카페라떼");
        map3.put("kind","커피");
        map3.put("price", "6,500");
        map3.put("reg_day","2020.10.29");
        map3.put("mod_day","2021.10.29");
        list.add(map3);

        log.info(list);

        return list;
    }

    public int doInsert(Coffee_menu coffeeMenu) {
        int i = menuDao.doInsert(coffeeMenu);
        return i;
    }

    public int doDelete(String strNo) {
        int i = menuDao.doDelete(strNo);
        return i;
    }

    // One row 조회
    public Map<String, Object> doListOne(String strNo) {
        Map<String, Object> map = menuDao.doListOne(strNo);

        return map;
    }

    // Update
    public int doUpdate(Coffee_menu coffeeMenu) {
        int i = menuDao.doUpdate(coffeeMenu);
        return i;
    }

    public List<Coffee_menu> doSerch(String strStartDate, String strEndDate, String strCoffee, String strKind) {
        List<Coffee_menu> list = menuDao.doSerch(strStartDate, strEndDate, strCoffee, strKind);
        return list;
    }

    /* 가격변경 */
    public int doUpdatePrice(String strNo, String strPrice) {
        int int1 = menuDao.doUpdatePrice(strNo, strPrice);
        return int1;
    }

    /* 가격 로그입력 */
    public int doInsertLog(String strNo, String strPrice) {
        int int2 = menuDao.doInsertLog(strNo, strPrice);
        return int2;
    }

}
