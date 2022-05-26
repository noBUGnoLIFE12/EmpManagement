package com.emp.empmanagement.controller;

import com.emp.empmanagement.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class MemberManageController {
    @Resource
    MemberService memberService;
    @RequestMapping(value="/membermanage")
    public String memberManage(){
        return "membermanage";
    }
}
