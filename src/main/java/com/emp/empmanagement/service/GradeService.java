package com.emp.empmanagement.service;

import com.emp.empmanagement.bean.Grade;

import java.util.List;

public interface GradeService {
    Grade queryById(Integer id);
    List<Grade> queryAllByLimit(int offset, int limit);
    List<Grade> queryByCondition(String name,String course_name,Integer grade);
    List<Grade> queryAll();

    boolean insert(Grade grade);
    boolean update(Grade grade);
    boolean deleteById(Integer id);
}
