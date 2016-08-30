package com.example.lenovo.testrealm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmResults;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Realm realm;
    private Button query;
    private StringBuilder sb = new StringBuilder();
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        realm = Realm.getDefaultInstance();
        initView();

    }


    private void initView() {
        query = (Button) findViewById(R.id.query);

        query.setOnClickListener(this);
        display = (TextView) findViewById(R.id.display);
        display.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.query:
                RealmResults<Dog> all = realm.where(Dog.class)
                        .findAll();
                sb.delete(0, sb.length());
                for (Dog d : all) {
                    sb.append(d + "\n");

                }
                display.setText(sb);
                break;
        }
    }
}
