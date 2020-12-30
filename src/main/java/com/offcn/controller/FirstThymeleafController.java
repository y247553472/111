package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FirstThymeleafController {
    /**
     * 访问http://localhost:8080/first
     * 将数据message填充到templates/index.html
     * @param model
     * @return
     */
    @GetMapping("/first")
    public String indexPage(Model model){
        String message = "Hello, thymeleaf";
        model.addAttribute("message", message);
        model.addAttribute("jpg", "3c10b2cd-9101-4c88-a28b-8ee0ebeea39a4cf0a3de4b98bfe747efd534b1780217.jpg");
        return "index";
    }

}
