package com.faith.entity;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-27
 * @Description: com.faith.entity
 * @version: 1.0
 */
public class Student {
    private String name;
    private int age;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
