package com.lynas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by sazzad on 6/22/15.
 */
@Controller
public class HomeController {

    @Autowired
    JdbcTemplate jdbcConnection;


    @RequestMapping("/")
    public String home(){
        return "home";
    }


    @RequestMapping("/test")
    public String test(Map<String, Object> map, @RequestParam String test) {
        String sql = "select count(*) from test";
        map.put("test", jdbcConnection.queryForInt(sql));
        return "home";
    }
}
