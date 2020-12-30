package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {
    @GetMapping("/set")
    public String setSession(HttpSession httpSession){
        httpSession.setAttribute("msg", "hello");
        return "OK";
    }

    @GetMapping("/get")
    public String getSession(HttpSession httpSession){
        return (String)httpSession.getAttribute("msg");
    }


}
