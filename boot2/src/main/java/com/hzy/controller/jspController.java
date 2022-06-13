package com.hzy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jspController {
@RequestMapping("jsp")
    public String jsp(){
    System.out.println("hello motherfucker");
    return "index";

    }
}
