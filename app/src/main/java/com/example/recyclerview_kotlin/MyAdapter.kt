package com.example.recyclerview_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(var c: Context, var objects: Array<String>) :
    RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(c).inflate(R.layout.objects, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtObjectName.text = objects[position]
    }

    override fun getItemCount(): Int {
        return objects.size
    }
}

