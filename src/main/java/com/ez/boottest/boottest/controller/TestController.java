package com.ez.boottest.boottest.controller;

import com.ez.boottest.boottest.dao.PlaceDAO;
import com.ez.boottest.boottest.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    PlaceDAO placeDAO;

    @RequestMapping("/")
    public String getView(Model model) {
        model.addAttribute("msg", "Hello there, This message has been injected from the controller method");
        Place p = placeDAO.getByName("test");
        placeDAO.addNew("test2");
        return "hello";
    }

//    @RequestMapping("/")
//    public String getView(Model model) {
//        model.addAttribute("msg", "Hello there, This message has been injected from the controller method");
//        return "hello";
//    }
}
