package com.emp.empmanagement.mapper;

import com.emp.empmanagement.bean.Course;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {
    Course queryById(Integer id);
    @Select("SELECT * FROM course")
    List<Course> queryAll();

    int insert(Course course);
    int update(Course course);


    List<Course> queryAllByLimit(int offset, int limit);

    int deleteById(Integer id);
}
