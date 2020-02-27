package com.example.babgladeshapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private  ListView listView;
    String[]countryNames;
    private Context mContext;
    // web start
    ArrayList<String>titleArraylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mContext=MainActivity.this;
        titleArraylist= new ArrayList<String>();
        titleArraylist.add(country.p1);
        titleArraylist.add(country.p2);
        titleArraylist.add(country.p3);
        titleArraylist.add(country.p4);
        titleArraylist.add(country.p5);
        titleArraylist.add(country.p6);
        titleArraylist.add(country.p7);
        titleArraylist.add(country.p8);
        titleArraylist.add(country.p9);
        titleArraylist.add(country.p10);


     listView= findViewById(R.id.ListId);
     countryNames=getResources().getStringArray(R.array.bangladesh);
     ArrayAdapter<String>adapter= new ArrayAdapter<String>(this,R.layout.sv,R.id.TextId,countryNames);
     listView.setAdapter(adapter);

     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

             Intent intent= new Intent(MainActivity.this,DetailsActivity.class);
             intent.putExtra("titles",countryNames[position]);
             intent.putExtra("details", titleArraylist.get(position));
             startActivity(intent);

         }
     });

    }
}
