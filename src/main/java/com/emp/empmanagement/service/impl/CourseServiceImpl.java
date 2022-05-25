package com.emp.empmanagement.service.impl;

import com.emp.empmanagement.bean.Course;
import com.emp.empmanagement.mapper.CourseMapper;
import com.emp.empmanagement.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.annotation.Repeatable;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;
    @Override
    public Course queryById(Integer id){
        return this.courseMapper.queryById(id);
    }

    @Override
    public List<Course> queryAllByLimit(int offset, int limit) {
        return this.courseMapper.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Course> queryAll() {
        return this.courseMapper.queryAll();
    }

    @Override
    public Course insert(Course course) {
        this.courseMapper.insert(course);
        return course;
    }

    @Override
    public Course update(Course course) {
        this.courseMapper.update(course);
        return this.queryById(course.getCourse_id());
    }

    @Override
    public boolean deleteById(Integer id) {
        return this.courseMapper.deleteById(id) > 0;
    }
}
