package com.gmail.sergejpsh.l04;

import java.util.Comparator;

public class Dog{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
	//ttt

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
