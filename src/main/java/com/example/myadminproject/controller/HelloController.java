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

        log.info("helloController");
        return "index";
    }

    @GetMapping("/grid")
    public String grid(){

        log.info("gridController");
        return "grid";
    }

    @GetMapping("/board")
    public String board(){

        log.info("boardController");
        return "board";
    }
    @GetMapping("/excel")
    public String excel(){

        log.info("excelController");
        return "excel";
    }
    @GetMapping("/chart")
    public String chart(){

        log.info("chartController");
        return "chart";
    }
    @GetMapping("/lostark")
    public String lostark(){

        log.info("lostarkController");
        return "lostark";
    }
    @GetMapping("/login")
    public String login(){

        log.info("loginController");
        return "login";
    }
    @GetMapping("/register")
    public String register(){

        log.info("registerController");
        return "register";
    }
    @GetMapping("/contact")
    public String contact(){

        log.info("contactController");
        return "contact";
    }
}
