package com.example.springboot.entity;

import javax.persistence.*;

/**
 * Created by GM on 2017/9/11.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private long id;
    // 指定生成表中的列名
//    @Column(name="demo_name")
    private String name;
    private String age;
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
