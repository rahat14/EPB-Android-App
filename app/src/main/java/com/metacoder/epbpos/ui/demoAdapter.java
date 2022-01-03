package com.metacoder.epbpos.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.metacoder.epbpos.R;

import org.jetbrains.annotations.NotNull;

/*** Created by Rahat Shovo on 8/22/2021 
 */
public class demoAdapter extends RecyclerView.Adapter<demoAdapter.viewholder> {

    private Context context;
    private String rowNmae = "";


    public demoAdapter(Context context, String name) {
        this.context = context;
        this.rowNmae = name;
    }

    @Override
    public @NotNull
    viewholder onCreateViewHolder(@NonNull ViewGroup parent,
                                  int viewType) {
        View v;
        if (rowNmae.contains("user")) {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_cutomers, parent, false);
        } else if ( rowNmae.contains("suppliers")) {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_supplier, parent, false);
        }else if (rowNmae.contains("pVertical")){
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_product_vertical, parent, false);
        }else if (rowNmae.contains("products")){
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_product_horizontral, parent, false);
        }
        else if (rowNmae.contains("order")){
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_order_history, parent, false);
        }
        else if (rowNmae.contains("expense")){
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_expense, parent, false);
        }else if (rowNmae.contains("category")){
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_category_vertical, parent, false);
        }


        else {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_cutomers, parent, false);
        }


        return new viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {


    }


    @Override
    public int getItemCount() {

        return 6;
    }

    class viewholder extends RecyclerView.ViewHolder {

        viewholder(@NonNull View itemView) {
            super(itemView);
        }


    }


}