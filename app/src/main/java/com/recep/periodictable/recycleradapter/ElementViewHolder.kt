package com.recep.periodictable.recycleradapter

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.recep.periodictable.R
import com.recep.periodictable.model.ElementModel
import com.recep.periodictable.model.ElementType
import com.recep.periodictable.ui.ElementDialogFragment

class ElementViewHolder(itemView: View, private val dialog: FragmentManager) : RecyclerView.ViewHolder(itemView) {
    init {
        itemView.setOnClickListener {
            val position: Int = adapterPosition
            Toast.makeText(itemView.context, "Clicked #${position} item", Toast.LENGTH_SHORT).show()

            val elementDialogFragment = ElementDialogFragment()
            elementDialogFragment.show(dialog, "Element Dialog")

        }
    }

    fun bind(element: ElementModel) {
        val elementAtomNumber = itemView.findViewById<TextView>(R.id.textView_atom_number)
        val elementSymbol = itemView.findViewById<TextView>(R.id.textView_symbol)
        val elementName = itemView.findViewById<TextView>(R.id.textView_name)
        val elementType = itemView.findViewById<FrameLayout>(R.id.element_type)
        val beautification = itemView.findViewById<FrameLayout>(R.id.beautification)
        val radioactivity = itemView.findViewById<FrameLayout>(R.id.radioactivity)

        elementAtomNumber.text = element.atomNumber
        elementSymbol.text = element.symbol
        elementName.text = element.name

        beautification.backgroundConfig(element)
        elementType.setIndicator(element)
        itemView.hideItem(element)
    }

    private fun View.backgroundConfig(element: ElementModel) {
        this.alpha = 0.2F
        this.setBackgroundResource(
            when (element.elementType) {
                ElementType.ALKALI_METAL -> R.color.alkali_metal
                ElementType.ALKALINE_EARTH_METAL -> R.color.alkaline_earth_metal
                ElementType.TRANSITION_METAL -> R.color.transition_metal
                ElementType.METAL -> R.color.metal
                ElementType.METALOID -> R.color.metaloid
                ElementType.NON_METAL -> R.color.non_metal
                ElementType.HALOGEN -> R.color.halogen
                ElementType.NOBLE_GAS -> R.color.noble_gas
                ElementType.LANTHANIDE -> R.color.lanthanide
                ElementType.ACTINIDE -> R.color.actinide
                else -> R.color.none
            }
        )
    }

    private fun View.setIndicator(element: ElementModel) {
        this.setBackgroundResource(
            when (element.elementType) {
                ElementType.ALKALI_METAL -> R.color.alkali_metal
                ElementType.ALKALINE_EARTH_METAL -> R.color.alkaline_earth_metal
                ElementType.TRANSITION_METAL -> R.color.transition_metal
                ElementType.METAL -> R.color.metal
                ElementType.METALOID -> R.color.metaloid
                ElementType.NON_METAL -> R.color.non_metal
                ElementType.HALOGEN -> R.color.halogen
                ElementType.NOBLE_GAS -> R.color.noble_gas
                ElementType.LANTHANIDE -> R.color.lanthanide
                ElementType.ACTINIDE -> R.color.actinide
                else -> R.color.none
            }
        )
    }

    fun View.isRadioactive(element: ElementModel) {
        if (element.radioactive) {
            this.setBackgroundResource(R.drawable.radiation)
        }
    }

    private fun View.hideItem(element: ElementModel) {
        if (element.elementType == ElementType.NONE) {
            this.isClickable = false
            this.visibility = View.GONE
        }
    }

}