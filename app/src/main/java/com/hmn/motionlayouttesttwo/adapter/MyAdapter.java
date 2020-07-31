package com.hmn.motionlayouttesttwo.adapter;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.hmn.motionlayouttesttwo.databinding.EntityNewBinding;

import java.util.ArrayList;

public class MyAdapter {
    ArrayList<String> pojo;
    Context context;

    public MyAdapter(ArrayList<String> pojo, Context context) {
        this.pojo = pojo;
        this.context = context;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        EntityNewBinding binding;
        MyViewHolder(EntityNewBinding b)
        {
            super(b.getRoot());
            binding = b;
        }
    }
}
