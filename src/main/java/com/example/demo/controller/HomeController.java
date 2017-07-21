package com.example.demo.controller;

import com.example.demo.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.Calendar;

/**
 * Created by Mr.Darkwater on 2017/7/20.
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(Model model,
                           HttpSession session) {
        session.setAttribute("user", new User("firstName","lastName",
        "nationality", 12));
        model.addAttribute("today", Calendar.getInstance());
        return "home";
    }
}
