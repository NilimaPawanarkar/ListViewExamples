package com.example.nilima.listviewexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] bookname={"JAVA","Oracle",".NET","ASP.NET","C#","C++","python","VB.NET"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter arrayAdapter= new ArrayAdapter(this,R.layout.listview_activity,bookname);
        ListView listView=(ListView)findViewById(R.id.listview1);
        listView.setAdapter(arrayAdapter);


    }
}
