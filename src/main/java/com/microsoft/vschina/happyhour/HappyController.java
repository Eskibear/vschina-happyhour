package com.microsoft.vschina.happyhour;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HappyController {

    @RequestMapping("/")
    public String index() {
        return "<h1>Happy Hour!</h1>";
    }
}