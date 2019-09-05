package edu.hubu.myfun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexPage {
    @RequestMapping
    public String getIndexPage(){
        return "index";
    }
}
