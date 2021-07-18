package com.example.recyclerview_kotlin

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var txtObjectName: TextView

    init {
        txtObjectName = itemView.findViewById<View>(R.id.txtobje) as TextView
    }
}
