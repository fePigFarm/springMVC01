package com.faith.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Past;
import java.util.Date;

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

    @Past // 当前时间以前
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 数据格式化
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

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
