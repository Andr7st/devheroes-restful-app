package com.devheroes.restful.app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SuppressWarnings({"unused"})
public class IndexController {

    @GetMapping({"","/"})
    public String index(Model model) {

        List<String> l = new ArrayList<>();
        l.add("Andrés Segura");

        model.addAttribute("title", "RESTFul info");
        model.addAttribute("developers", l);

        return "index";
    }
}
