package com.recep.periodictable.recycleradapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.recep.periodictable.databinding.AdapterItemElementBinding
import com.recep.periodictable.model.ElementModel

class ElementAdapter(private val elementList: List<ElementModel>, private val supportFragmentManager: FragmentManager) :
    RecyclerView.Adapter<ElementViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AdapterItemElementBinding.inflate(inflater, parent, false)
        return ElementViewHolder(binding,supportFragmentManager, elementList)
    }

    override fun onBindViewHolder(holder: ElementViewHolder, position: Int) {
        val elementModel = elementList[position]
        holder.bind(elementModel)
    }

    override fun getItemCount(): Int {
        return elementList.size
    }
}