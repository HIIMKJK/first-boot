package com.boot.Sailing.v2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v2")
public class HomeConV2 {

    @RequestMapping("/home")
    public String doHome(){

        return "/v2/home/home";
    }

    @GetMapping("/v2/home2")
    public String doHome2Get(){
        System.out.println("Get ");
        return "/v2/home/home";
    }

    @PostMapping("/v2/home")
    public String doHome2Post(){
        System.out.println("Post ");
        return "/v2/home/home";
    }


}
