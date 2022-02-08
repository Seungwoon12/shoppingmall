package com.siblings.shoppingmall.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*")
public class HomeController {

    // @GetMapping("/")
    // public String home() {
    // log.info("home");
    // return "index";

    // }
}
