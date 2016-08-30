package com.example.lenovo.testrealm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Realm realm;
    private EditText e1;
    private EditText e2;
    private Button btn;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        realm = Realm.getDefaultInstance();


        initView();

    }

    private void initView() {
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        btn = (Button) findViewById(R.id.btn);
        btn2 = (Button) findViewById(R.id.btn2);

        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                String name = e1.getText().toString();
                int age = Integer.parseInt(e2.getText().toString());
                Dog dog = new Dog();
                dog.setName(name);
                dog.setAge(age);
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(dog);
                realm.commitTransaction();
                break;
            case R.id.btn2:
                RealmResults<Dog> all = realm.where(Dog.class)
                        .findAll();
                for (Dog d : all) {

                    Log.e("ww", "cc==" + d.getAge() + " name " + d.getName());
                }
                break;
            case R.id.btn3:
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                break;
        }
    }


}
