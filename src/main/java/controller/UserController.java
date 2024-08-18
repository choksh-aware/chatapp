package com.example.chatappfinal.controller;

import com.example.chatappfinal.entity.User;
import com.example.chatappfinal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @PostMapping("/signup")
    public ModelAndView signup(@RequestParam String username, @RequestParam String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.save(user);
        return new ModelAndView("redirect:/login");
    }
}
