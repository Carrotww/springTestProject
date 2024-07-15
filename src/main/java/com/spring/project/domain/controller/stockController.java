package com.spring.project.domain.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class stockController {

    @PostMapping("/api/post1")
    public String post1() {
        return "print post1";
    }

}
