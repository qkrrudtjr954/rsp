package com.rsp.main;

import java.util.Comparator;

/**
 * Created by kspark on 2017. 7. 20..
 */
public class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public boolean compare(User user) {
        int gap = Math.abs(this.getAge()-user.getAge());

        if (gap >= 10) {
            return false;
        }else{
            return true;
        }
    }
}
