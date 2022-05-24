package com.emp.empmanagement.service.impl;

import com.emp.empmanagement.bean.Member;
import com.emp.empmanagement.mapper.MemberMapper;
import com.emp.empmanagement.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<Member> queryAll(){
        return this.memberMapper.queryAll();
    }

    /**
     * 根据条件查询数据
     */
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
    /**
    * 修改数据
    */
    @Override
    public boolean update(Member member){
        System.out.println(member.toString());
        this.memberMapper.update(member);
        return this.memberMapper.update(member)>0;
    }
    /**
     * 通过主键删除数据
     */
    @Override
    public boolean deleteById(Integer id){
        return this.memberMapper.deleteById(id)>0;
    }

}
