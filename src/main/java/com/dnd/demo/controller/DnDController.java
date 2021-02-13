package com.dnd.demo.controller;

import com.dnd.demo.service.DnDService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DnDController {

    private final DnDService dnDService;

    public DnDController(DnDService dnDService) {
        this.dnDService = dnDService;
    }

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }
}
