package com.emp.empmanagement.service;

import com.emp.empmanagement.bean.Course;


import java.util.List;

public interface CourseService {
    Course queryById(Integer course_id);
    List<Course> queryAllByLimit(int offset, int limit);
    List<Course> queryAll();
    Course insert(Course course);
    Course update(Course course);
    boolean deleteById(Integer id);

}
