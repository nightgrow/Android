package com.example.dsm2018.calculator_jumpup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerView.setLayoutManager(layoutManager);


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
        RecyclerAdapter adapter = new RecyclerAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
