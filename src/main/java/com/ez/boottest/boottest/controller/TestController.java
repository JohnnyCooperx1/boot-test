package com.ez.boottest.boottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String getView(Model model) {
        model.addAttribute("msg", "Hello there, This message has been injected from the controller method");
        return "hello";
    }
}
