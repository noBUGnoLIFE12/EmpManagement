package com.emp.empmanagement.service.impl;

import com.emp.empmanagement.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberDao memberDao;
}
