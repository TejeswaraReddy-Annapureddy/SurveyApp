package com.example.surveyapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        String name=intent.getExtras().getString("name");
        String age=intent.getExtras().getString("age");
        final ArrayList<tej> List1 = new ArrayList<tej>();
        List1.add(new tej(name,age,R.drawable.r));
        adapters numbersArrayAdapter = new adapters(this,List1);
        ListView numbersListView = findViewById(R.id.list);
        numbersListView.setAdapter(numbersArrayAdapter);


    }
}
