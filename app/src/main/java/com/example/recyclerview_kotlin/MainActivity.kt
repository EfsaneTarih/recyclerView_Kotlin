package com.example.recyclerview_kotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity()
{
    var recyclerView: RecyclerView? = null
    var objects = arrayOf("elma", "bisiklet", "harita", "kalem", "araba", "bilgisayar")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(this, objects)
        recyclerView!!.adapter = adapter

    }

    
}