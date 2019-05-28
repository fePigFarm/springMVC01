package com.faith.entity;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-29
 * @Description: com.faith.entity
 * @version: 1.0
 */
public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
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
}
