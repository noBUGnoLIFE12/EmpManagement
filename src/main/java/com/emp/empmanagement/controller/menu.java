package com.emp.empmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class menu {
    @RequestMapping(value="/menu")
    public String viewMenu(){
        return("/menu");
    }
    }
