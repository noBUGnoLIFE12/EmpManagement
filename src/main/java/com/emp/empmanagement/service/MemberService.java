package com.emp.empmanagement.service;

import com.emp.empmanagement.bean.Member;

import java.util.List;

public interface MemberService {
    /**
     * 通过ID查询单条数据
     *
     * @param  id 主键
     * @return 实例对象
     */
    Member queryById(Integer id);

    /**
    * 查询数据库中member表的所有数据
    *
    * @return 对象列表
    */
     List<Member> queryAll();

    /**
     * 根据条件查询数据
     */
     List<Member> queryByCondition(String name, Integer age, String gender,String phone_num, String address);

     /**
     * 新增数据
     */
     Member insert(Member member);

     /**
      * 修改数据
     */
     boolean update(Member member);

     /**
     * 删除数据
     */
     boolean deleteById(Integer id);
}
