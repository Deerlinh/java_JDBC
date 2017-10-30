package com.kaishengit.entity;

/**
 * Created by 蔡林红 on 2017/10/30.
 */
public class Mybatis {
    private int id;
    private String name;
    private int age;
    private int clsId;

    @Override
    public String toString() {
        return "Mybatis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", clsId=" + clsId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getClsId() {
        return clsId;
    }

    public void setClsId(int clsId) {
        this.clsId = clsId;
    }

    public void getAge(int age) {
    }
}
