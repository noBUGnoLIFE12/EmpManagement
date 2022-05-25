package com.emp.empmanagement.mapper;

import com.emp.empmanagement.bean.Grade;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GradeMapper {
/**
 * 通过ID查询单条数据
 *
 * @param  id 主键
 * @return 实例对象
 */
Grade queryById(Integer id);

/**
 * 查询指定行数据
 *
 * @param offset 查询起始位置
 * @param limit 查询条数
 * @return 对象列表
 */
List<Grade> queryAllByLimit(@Param("offset")int offset, @Param("limit")int limit);

/**
 * 通过实体作为筛选条件查询全部
 *
 * @return 对象列表
 */
List<Grade> queryAll();
@Select("SELECT * FROM grade WHERE name=#{name} AND course_name=#{course_name} AND grade=#{grade}")
    List<Grade> queryByCondition(String name, String course_name,Integer grade);

/**
 * 新增数据
 *
 * @param grade 实例对象
 * @return 影响行数
 */
@Insert("INSERT INTO grade(name, course_name,grade) VALUES(#{name},#{course_name},#{grade})")
    int insert(Grade grade);
/**
 * 修改数据
 *
 * @param grade 实例对象
 * @return 影响行数
 */
@Update("UPDATE grade SET name=#{name},course_name=#{course_name},grade=#{grade} WHERE id=#{id}")
    int update(Grade grade);
/**
* 通过主键删除数据
*
* @param  id
* @return 影响行数
 */
int deleteById(Integer id);
}
