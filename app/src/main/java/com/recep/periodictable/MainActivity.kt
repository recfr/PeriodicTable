package com.recep.periodictable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.recep.periodictable.recycleradapter.ElementAdapter
import com.recep.periodictable.data.ElementList

class MainActivity : AppCompatActivity()  {
//    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ElementAdapter(ElementList.generateData(), supportFragmentManager)

        recyclerView.layoutManager = GridLayoutManager(this, 10, RecyclerView.HORIZONTAL, false)

        // to prevent unwanted layout visibility access when scrolling
        recyclerView.recycledViewPool.setMaxRecycledViews(0,0)

//        recyclerView.itemAnimator

//        val elementDialogFragment = ElementDialogFragment()
//        elementDialogFragment.show(supportFragmentManager, "Element Dialog")

    }

}