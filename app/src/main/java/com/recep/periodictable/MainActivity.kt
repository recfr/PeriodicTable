package com.recep.periodictable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.recep.periodictable.data.ElementList

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        binding.recyclerView.adapter = ElementAdapter(ElementList.generateData())
//        binding.recyclerView.layoutManager = GridLayoutManager(this,5)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ElementAdapter(ElementList().generateData())
        recyclerView.layoutManager = GridLayoutManager(this, 10, RecyclerView.HORIZONTAL, false)
    }
}