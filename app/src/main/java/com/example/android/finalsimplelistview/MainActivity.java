package com.example.android.finalsimplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView myListView ;
    ArrayList<String> myArrayList;
    ArrayAdapter myArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView)findViewById(R.id.myListView);

        myArrayList = new ArrayList<String>();

        for(int i=0; i<100; i++)
             myArrayList.add("Hello Android !");

        myArrayAdapter = new ArrayAdapter(MainActivity.this , android.R.layout.simple_list_item_1 , myArrayList);

        myListView.setAdapter(myArrayAdapter);

    }
}
