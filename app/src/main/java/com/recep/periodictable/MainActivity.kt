package com.recep.periodictable

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.recep.periodictable.data.ElementList
import com.recep.periodictable.databinding.ActivityMainBinding
import com.recep.periodictable.recycleradapter.ElementAdapter
import com.recep.periodictable.ui.InfoFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(binding.myToolbar)

        binding.imageViewInfo.setOnClickListener {
            val infoFragment = InfoFragment()
            infoFragment.show(
                supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out),
                "Info Dialog"
            )
        }

//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = ElementAdapter(ElementList.generateData(), supportFragmentManager)
        binding.recyclerView.layoutManager = GridLayoutManager(this, 10, RecyclerView.HORIZONTAL, false)
        // to prevent unwanted layout visibility access when scrolling
        binding.recyclerView.recycledViewPool.setMaxRecycledViews(0, 0)
    }

    override fun onBackPressed() {
        binding.recyclerView.removeAllViews()
        binding.recyclerView.removeAllViewsInLayout()
        super.onBackPressed()

    }

}