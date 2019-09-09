package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @RequestMapping("/version")
    public String versionInfo() {
        return "0.1-snapshot";
    }
}