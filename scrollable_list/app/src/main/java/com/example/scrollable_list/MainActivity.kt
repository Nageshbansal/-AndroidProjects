package com.example.scrollable_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.scrollable_list.adapter.ItemAdapter
import com.example.scrollable_list.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val textView : TextView = findViewById(R.id.textview)
//        textView.text = Datasource().loadAffirmations().size.toString()
        val mydataset =  Datasource().loadAffirmations()

        var recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this,mydataset)
        recyclerView.setHasFixedSize(true)


    }



}


