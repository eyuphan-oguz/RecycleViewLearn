package com.eyuphanoguz.recycleviewlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

       private lateinit var  mRecyclerView:RecyclerView
       private lateinit var adapter: FruitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView = findViewById(R.id.main_activity_recyclerView)
        adapter = FruitAdapter(Fruits.getData(),this)

        mRecyclerView.setHasFixedSize(true)

        val manager : LinearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL , false)

        mRecyclerView.setLayoutManager(manager)

        mRecyclerView.setAdapter(adapter)

        
    }
}