package com.metacoder.epbpos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.metacoder.epbpos.ui.AllOrders;
import com.metacoder.epbpos.ui.Customers;
import com.metacoder.epbpos.ui.Expenses;
import com.metacoder.epbpos.ui.PosPage;
import com.metacoder.epbpos.ui.ProductSearch;
import com.metacoder.epbpos.ui.suppliers;

public class DashBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.customer).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), Customers.class)));

        findViewById(R.id.supplier).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), suppliers.class)));

        findViewById(R.id.expense).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),  Expenses.class)));

        findViewById(R.id.settings).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), Settings.class)));

        findViewById(R.id.pos).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), PosPage.class)));

        findViewById(R.id.report).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), Report.class)));

        findViewById(R.id.products).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), ProductSearch.class)));

        findViewById(R.id.allOrders).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), AllOrders.class)));

    }
}