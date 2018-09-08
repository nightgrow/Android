package com.example.dsm2018.calculator_jumpup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        ArrayList<Contact> data = new ArrayList<>();
        data.add(new Contact("제니", "010-1234-5678"));
        data.add(new Contact("제니", "010-1234-5678"));
        data.add(new Contact("제니", "010-1234-5678"));
        data.add(new Contact("제니", "010-1234-5678"));
        data.add(new Contact("제니", "010-1234-5678"));
        data.add(new Contact("제니", "010-1234-5678"));
        data.add(new Contact("제니", "010-1234-5678"));
        data.add(new Contact("제니", "010-1234-5678"));
        data.add(new Contact("제니", "010-1234-5678"));
        data.add(new Contact("제니", "010-1234-5678"));
        data.add(new Contact("제니", "010-1234-5678"));
        data.add(new Contact("제니", "010-1234-5678"));

        CusctomAdapter adapter = new CusctomAdapter(data);

        ListView listView = findViewById(R.id.list_views);
        listView.setAdapter(adapter);
    }
}
