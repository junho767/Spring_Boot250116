package com.example.demo.domain.wiseSaying.controller;

import com.example.demo.domain.wiseSaying.entity.WiseSaying;
import com.example.demo.domain.wiseSaying.service.WiseSayingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class WiseSayingController {
    private final WiseSayingService wiseSayingService;

    @GetMapping("/wiseSayings")
    public List<WiseSaying> getWiseSayings() {
        return wiseSayingService.getAllItems();
    }

    @GetMapping("/wiseSaying/write")
    public WiseSaying writeWiseSaying(String content, @RequestParam(defaultValue = "no name") String author) {
        System.out.println("content = " + content);
        System.out.println("author = " + author);
        return wiseSayingService.write(content, author);
    }

    @GetMapping("/wiseSayings/{id}")
    public Optional<WiseSaying> getWiseSayingById(@RequestParam int id) {
        return wiseSayingService.getItem(id);
    }

    @GetMapping("/wiseSayings/{id}/delete")
    public boolean deleteItem(@PathVariable int id) {
        return wiseSayingService.deleteById(id);
    }
}