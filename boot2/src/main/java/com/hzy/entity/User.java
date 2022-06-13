package com.hzy.entity;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Date birthday;
    private Double salary;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public User() {
    }

    public User(Integer id, String name, Date birthday, Double salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }
}
