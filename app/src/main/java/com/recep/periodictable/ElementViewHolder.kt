package com.recep.periodictable

import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.recep.periodictable.model.ElementModel
import com.recep.periodictable.model.ElementType

class ElementViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(element: ElementModel) {
        val elementAtomNumber = itemView.findViewById<TextView>(R.id.textView_atom_number)
        val elementSymbol = itemView.findViewById<TextView>(R.id.textView_symbol)
        val elementName = itemView.findViewById<TextView>(R.id.textView_name)
        val elementType = itemView.findViewById<FrameLayout>(R.id.element_type)
//        val elementContainer = itemView.findViewById<LinearLayout>(R.id.element_container)

        if (element.atomNumber == 0) {
            elementAtomNumber.visibility = View.GONE
        }

        elementAtomNumber.text = element.atomNumber.toString()
        elementSymbol.text = element.symbol
        elementName.text = element.name

        elementType.setBackgroundResource(
            when (element.elementType) {
                ElementType.AMETAL -> R.color.ametal
                ElementType.ALKALI_METAL -> R.color.alkali_metal
                ElementType.TOPRAK_ALKALI_METAL -> R.color.toprak_alkali
                ElementType.YARI_METAL -> R.color.yari_metal
                ElementType.GECIS_METALLERI -> R.color.gecis_metalleri
                ElementType.HALOJENLER -> R.color.halojenler
                ElementType.SOYGAZ -> R.color.soygazlar
                ElementType.LANTANITLER -> R.color.lantanitler
                ElementType.AKTINITLER -> R.color.aktinitler
                else -> R.color.none
            }
        )
    }
}