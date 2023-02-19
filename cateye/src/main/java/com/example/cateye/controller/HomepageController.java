package com.example.cateye.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomepageController {

    @GetMapping("/homepage")
    public String getPage() {
        return "homepage";
    }
}
