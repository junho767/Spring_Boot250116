package com.example.demo.domain.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/byte")
    @ResponseBody
    public byte getByte() {
        return 1;
    }

    @GetMapping("/short")
    @ResponseBody
    public short getShort() {
        return 1;
    }

    @GetMapping("/long")
    @ResponseBody
    public long getLong() {
        return 1;
    }

    @GetMapping("/float")
    @ResponseBody
    public float getFloat() {
        return 3.14f;
    }

    @GetMapping("/double")
    @ResponseBody
    public double getDouble() {
        return 3.14;
    }

    @GetMapping("/char")
    @ResponseBody
    public char getChar() {
        return '안';
    }

    @GetMapping("/boolean")
    @ResponseBody
    public boolean getBoolean() {
        return true;
    }

    @GetMapping("/array")
    @ResponseBody
    public String[] getArray() {
        return new String[]{"a", "b", "c"};
    }

    @GetMapping("/list")
    @ResponseBody
    public List<String> getList() {
        return List.of("a", "b", "c");
    }

    @GetMapping("/map")
    @ResponseBody
    public Map<String, String> getMap() {
        return Map.of("k1", "v1", "k2", "v2");
    }

    @GetMapping("/article")
    @ResponseBody
    public Article article() {
        return Article.builder()
                .title("제목")
                .body("오늘은 목요일이다")
                .isDeleted(false)
                .build();
    }
}

@Getter
@Builder
class Article {
    private int id;
    private String title;
    private String body;
    private boolean isDeleted;

}
