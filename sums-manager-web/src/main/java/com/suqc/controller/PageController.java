package com.suqc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String gotoPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/test/json")
    @ResponseBody
    public Map<String,Object> TestJSON(){
        Map<String,Object> map = new HashMap<>();
        map.put("id",10011);
        map.put("name","suqc");
        map.put("birthday",new Date());
        return map;
    }
}
