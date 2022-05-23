package com.emp.empmanagement.bean;

import java.io.Serializable;

/**
 * (Member)实体类
 */

public class Member implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * key id
     */
    private Integer id;
    /**
     * name
     */
    private  String name;
    /**
     * age
     */
    private  Integer age;
    /**
     * gender
     */
    private  String gender;
    /**
     * phone_number
     */
    private  String phone_num;
    /**
     * address
     */
    private  String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone_num='" + phone_num + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
