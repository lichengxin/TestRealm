package com.example.lenovo.testrealm;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * 作者：Keven on 2016/8/30 13:57
 * <p>
 * 邮箱：xinyao0626@gmail.com
 */
public class App extends Application {


    Realm realm;
    @Override
    public void onCreate() {
        super.onCreate();
        RealmConfiguration config = new RealmConfiguration.Builder(this)
                .name("test.realm").build();
        Realm.setDefaultConfiguration(config);

    }
}
