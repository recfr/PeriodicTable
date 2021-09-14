package com.recep.periodictable

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.recep.periodictable.model.ElementModel

class ElementAdapter(private val elementList: List<ElementModel>) : RecyclerView.Adapter<ElementViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.adapter_item_element, parent, false)
        return ElementViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ElementViewHolder, position: Int) {
        val elementModel = elementList[position]
        holder.bind(elementModel)
    }

    override fun getItemCount(): Int {
        return elementList.size
    }
}