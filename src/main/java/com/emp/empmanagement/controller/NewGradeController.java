package com.emp.empmanagement.controller;

import com.emp.empmanagement.bean.Grade;
import com.emp.empmanagement.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class NewGradeController {
    @Resource
    private GradeService gradeService;

    @RequestMapping(value="/newgrade")
    public String menu(){
        return  "newgrade";
    }
    @PostMapping("/newgrade")
    public String addGrade(Grade grade){
        System.out.println(grade.toString());
        gradeService.insert(grade);
        return "redirect:/newgrade";
    }
}
