package com.emp.empmanagement.controller;

import com.emp.empmanagement.service.GradeService;
import com.emp.empmanagement.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class GradeManageController {
    @Resource
    GradeService gradeService;
    @RequestMapping(value="/grademanage")
    public String menu(){
        return "grademanage";
    }
}
