package com.example.lenovo.testrealm;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * 作者：Keven on 2016/8/30 14:48
 * <p>
 * 邮箱：xinyao0626@gmail.com
 */
public class Dog extends RealmObject {
    @PrimaryKey
    private String name;

    private int age;

    private int temp;

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

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
