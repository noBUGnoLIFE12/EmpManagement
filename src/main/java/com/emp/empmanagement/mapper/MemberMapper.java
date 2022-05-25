package com.emp.empmanagement.mapper;


import com.emp.empmanagement.bean.Member;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemberMapper {
/**
 * 通过ID查询单条数据
 */
    Member queryById(Integer id);
    @Select("SELECT * FROM member WHERE name=#{name} AND gender=#{gender} AND age=#{age} AND phone_num=#{phone_num} " +
            "AND address=#{address}")
    List<Member> queryByCondition(@Param("name")String name, @Param("age")Integer age, @Param("gender")String gender,
                                  @Param("phone_num")String phone_num, @Param("address")String address);

/**
 * 查询数据库中member表的所有数据
 /**
 * 查询指定行数据
 * @param offset 查询起始位置
 * @param limit 查询条数
 * @return 对象列表
 */
List<Member> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

/**
 * 通过实体作为筛选条件查询
 *
 * @param
 * @return 对象列表
 */
@Select("SELECT * FROM member")
List<Member> queryAll();

/**
 * 新增数据
 *
 * @param member 实例对象
 * @return 影响行数
 */
@Insert("INSERT INTO member(name, age, gender, phone_num, address) VALUES(#{name}, #{age}, #{gender}, #{phone_num}, #{address})")
int insert(Member member);

/**
 * 修改数据
 */
@Update("UPDATE member SET name=#{name}, age=#{age}, gender=#{gender}, phone_num=#{phone_num}, address=#{address} WHERE" +
        "id=#{id}")
int update(Member member);

/**
 * 删除数据
 */
int deleteById(Integer id);
}
