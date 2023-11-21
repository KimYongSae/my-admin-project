package com.example.myadminproject.controller;

import com.example.myadminproject.entity.UserEntity;
import com.example.myadminproject.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Log4j2
public class HelloController
{
    private final UserService userService;

    @Autowired
    public HelloController(UserService userService) {
        this.userService = userService;
    }

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
    @PostMapping("/register")
    public String registerUser(@ModelAttribute UserEntity user) {
        try {
            userService.registerNewUser(user);
            log.info("User registered: " + user);
            return "redirect:/"; // 성공 시 리디렉션될 페이지
        } catch (Exception e) {
            log.error("Registration error: " + e.getMessage());
            return "register"; // 실패 시 리디렉션될 페이지
        }
    }
    @GetMapping("/contact")
    public String contact(){

        log.info("contactController");
        return "contact";
    }
}
