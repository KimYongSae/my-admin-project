package com.example.myadminproject.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class HelloController
{
    @GetMapping("/")
    public String hello(){

        return "index";
    }

    @GetMapping("/grid")
    public String grid(){

        return "grid";
    }

    @GetMapping("/board")
    public String board(){

        return "board";
    }
    @GetMapping("/excel")
    public String excel(){

        return "excel";
    }
    @GetMapping("/chart")
    public String chart(){

        return "chart";
    }
    @GetMapping("/lostark")
    public String lostark(){

        return "lostark";
    }
    @GetMapping("/login")
    public String login(){

        return "login";
    }
    @GetMapping("/contact")
    public String contact(){

        return "contact";
    }
}
