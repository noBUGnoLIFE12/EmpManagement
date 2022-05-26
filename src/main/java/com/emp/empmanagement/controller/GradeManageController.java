package com.emp.empmanagement.controller;

import com.emp.empmanagement.bean.Course;
import com.emp.empmanagement.bean.Grade;
import com.emp.empmanagement.service.CourseService;
import com.emp.empmanagement.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GradeManageController {
    @Resource
    GradeService gradeService;

    @Resource
    CourseService courseService;

    @RequestMapping(value="/grademanage")
    public String gradeManage(Model model){
        List<Grade> gradeList = gradeService.queryAll();
        List<Course> courseList = courseService.queryAll();
        model.addAttribute("gradeList",gradeList);
        model.addAttribute("courseList",courseList);
        return "grademanage";
    }

    @PostMapping(value = "/searchGrade")
    public String searchGrade(Model model,Grade grade){
        List<Grade> searchGradeList = gradeService.queryByCondition(grade.getName(),grade.getCourse_name(),grade.getGrade());
        List<Course> courseList = courseService.queryAll();
        model.addAttribute("searchGradeList",searchGradeList);
        model.addAttribute("courseList",courseList);
        return "grademanage";
    }

    @RequestMapping(value = "/updateGrade", method = RequestMethod.POST)
    public String updateGrade(Model model,Grade grade){
        List<Course> courseList = courseService.queryAll();
        model.addAttribute("courseList",courseList);
        return "grademanage";

    }


}
