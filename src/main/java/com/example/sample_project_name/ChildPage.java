package com.example.sample_project_name;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChildPage{
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    // page1.html に対応する内容
    @RequestMapping("/page1")
    public String page1(){
        return "page1";
    }
}