package com.metacoder.epbpos.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.metacoder.epbpos.HelperClass;
import com.metacoder.epbpos.R;

public class ProductSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_search);

        RecyclerView recyclerView = findViewById(R.id.products);
        HelperClass.loadData(recyclerView, new LinearLayoutManager(this), new demoAdapter(this, "products"));

    }
}