package com.example.demo.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private int age = 0;

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "hello my name is junhoLee";
    }

    @GetMapping("introduce")
    @ResponseBody
    public String introduce() {
        return "안녕하세요 나는 이준호입니다.";
    }

    @GetMapping("age")
    @ResponseBody
    public int ageUp() {
        age++;
        return age;
    }
}
