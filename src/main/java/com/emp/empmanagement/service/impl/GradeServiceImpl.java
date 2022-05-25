package com.emp.empmanagement.service.impl;

import com.emp.empmanagement.bean.Grade;
import com.emp.empmanagement.mapper.GradeMapper;
import com.emp.empmanagement.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeMapper gradeMapper;

    @Override
    public Grade queryById(Integer id){
        return this.gradeMapper.queryById(id);
    }
    @Override
    public List<Grade> queryAllByLimit(int offset, int limit){
        return this.gradeMapper.queryAllByLimit(offset,limit);
    }
    @Override
    public List<Grade> queryByCondition(String name,String course_name, Integer grade){
        return this.gradeMapper.queryByCondition(name,course_name,grade);
    }
    @Override
    public List<Grade> queryAll(){
        return this.gradeMapper.queryAll();
    }
    @Override
    public boolean insert(Grade grade){
        return this.gradeMapper.insert(grade)>0;
    }
    @Override
    public boolean update(Grade grade){
        return this.gradeMapper.update(grade)>0;
    }

    @Override
    public boolean deleteById(Integer id) {
        return this.gradeMapper.deleteById(id)>0;
    }
}
