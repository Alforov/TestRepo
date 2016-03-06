package com.javahash.spring.config;

import java.util.Date;

/**
 * Created by Натали on 28.02.2016.
 */
public class User extends Parent implements Cloneable
{
    private String name;
    private Integer age;
    private Date date;

    public String getName() {
        return name;
    }

    public User(String name, Integer age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
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

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
