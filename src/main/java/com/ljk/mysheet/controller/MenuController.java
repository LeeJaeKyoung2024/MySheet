package com.ljk.mysheet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    @GetMapping("/")
    public String index() {
    	return "forward:/index.html";  // 정적 파일로 직접 포워딩
    }
    
    @GetMapping("/login")
    public String login() {
    	return "forward:/login.html";  // 정적 파일로 직접 포워딩
    }
}
