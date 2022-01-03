package com.metacoder.epbpos.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.metacoder.epbpos.HelperClass;
import com.metacoder.epbpos.R;

public class PosPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pos);

        RecyclerView recyclerView = findViewById(R.id.List) ;
        RecyclerView cat = findViewById(R.id.cList) ;

        HelperClass.loadData(recyclerView , new GridLayoutManager(this , 2 ) , new demoAdapter(this , "pVertical"));


        HelperClass.loadData( cat, new LinearLayoutManager(this ,  LinearLayoutManager.HORIZONTAL , false) , new demoAdapter(this , "category"));

    }
}