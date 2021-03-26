package com.jsstech.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private AutoCompleteTextView actv;
String  stringlist[]={"Web Designing","web","java","Ad.java","Data structure","core java","Java Script"};
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actv=findViewById(R.id.autoComplete);
        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,stringlist);
        actv.setAdapter(adapter);

       actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent,View view,int position,long id) {
               Toast.makeText(MainActivity.this,"your selected choice is" + stringlist[position],Toast.LENGTH_LONG).show();
           }
       });


    }
}