package com.app.boot.bean;

/**
 * @description
 * @author:ligang
 * @date: 2022/10/25/ 22:46
 **/


public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
