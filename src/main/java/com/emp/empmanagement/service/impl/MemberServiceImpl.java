package com.emp.empmanagement.service.impl;

import com.emp.empmanagement.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberMapper memberMapper;
    /**
     * 通过ID查询单条数据
     *
     * @param  id
     * @return 实例对象
     */
    @Override
    public Member queryById(Integer id){
        return this.memberMapper.queryById(id);
    }
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Member> queryAllByLimit(int offset, int limit){
        return this.memberMapper.queryAllByLimit(offset, limit);
    }
    @Override
    public List<Member> queryByCondition(String name, Integer age, String gender, String phone_num, String address){
        if(!name.isEmpty() && !gender.isEmpty() && age!=null && !phone_num.isEmpty() && !address.isEmpty()){
        }return this.memberMapper.queryByCondition(name,age,gender,phone_num,address);
    }
    /**
     * 新增数据
     */
    @Override
    public Member insert(Member member){
        this.memberMapper.insert(member);
        return member;

    }
}
