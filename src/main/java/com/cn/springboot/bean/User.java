package com.cn.springboot.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private Integer id;  //用户id

    private String userName;  //用户名

    private String passWard;   //用户密码

    private Integer age;  //用户年龄

    private Date date;   //用户生日

    private String locate;   //用户地址

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWard='" + passWard + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", locate='" + locate + '\'' +
                '}';
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWard() {
        return passWard;
    }

    public void setPassWard(String passWard) {
        this.passWard = passWard;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }
}
