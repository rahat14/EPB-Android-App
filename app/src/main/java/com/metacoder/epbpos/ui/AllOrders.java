package com.metacoder.epbpos.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.metacoder.epbpos.HelperClass;
import com.metacoder.epbpos.R;

public class AllOrders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_orders);
        RecyclerView recyclerView = findViewById(R.id.list) ;
        HelperClass.loadData(recyclerView , new LinearLayoutManager(this) , new demoAdapter(this , "order"));

    }

}