package com.emp.empmanagement.controller;

import com.emp.empmanagement.bean.Course;
import com.emp.empmanagement.bean.Grade;
import com.emp.empmanagement.service.CourseService;
import com.emp.empmanagement.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class NewGradeController {
    @Resource
    private GradeService gradeService;
    @Resource
    private CourseService courseService;

    @RequestMapping(value="/newgrade")
    public String newGrade(Model model,Grade grade){
        List<Course> courseList = courseService.queryAll();
        model.addAttribute("courseList", courseList);
        return  "newgrade";
    }
    @PostMapping("/newgrade")
    public String addGrade(Model model,Grade grade){
        System.out.println(grade.toString());
        gradeService.insert(grade);
        return "redirect:/newgrade";
    }
}
