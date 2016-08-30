package com.example.lenovo.testrealm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * 作者：Keven on 2016/8/29 17:45
 * <p/>
 * 邮箱：xinyao0626@gmail.com
 */
public class Entity extends RealmObject {
    @PrimaryKey
    private int id;
    private String name;

    private int age;



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
}
