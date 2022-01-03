package com.metacoder.epbpos;

import androidx.recyclerview.widget.RecyclerView;

import com.metacoder.epbpos.ui.demoAdapter;

public class HelperClass {
    public static void loadData(RecyclerView recyclerView, RecyclerView.LayoutManager manager, demoAdapter adapter) {
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}
