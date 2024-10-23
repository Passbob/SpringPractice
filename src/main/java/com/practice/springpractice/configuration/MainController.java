package com.practice.springpractice.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(value = {"/", "main"})
    public String defaultLocation(){
        System.out.println("메인이오");
        return "/main";
    }
}
