package com.devheroes.restful.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SuppressWarnings({"unused"})
public class IndexController {

    @GetMapping({"","/"})
    public String index(Model model) {
        model.addAttribute("title", "RESTFul info");
        model.addAttribute("message", "developing");
        return "/index";
    }
}
