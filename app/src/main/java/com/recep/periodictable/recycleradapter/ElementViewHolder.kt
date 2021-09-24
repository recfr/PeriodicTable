package com.recep.periodictable.recycleradapter

import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.recep.periodictable.R
import com.recep.periodictable.databinding.AdapterItemElementBinding
import com.recep.periodictable.enum.ElementType
import com.recep.periodictable.model.ElementModel
import com.recep.periodictable.ui.ElementDialogFragment


class ElementViewHolder(
    private val binding: AdapterItemElementBinding,
    private val dialog: FragmentManager,
    model: List<ElementModel>
) :
    RecyclerView.ViewHolder(binding.root) {
    init {
        itemView.setOnClickListener {
            createDialog(model)
        }
    }

    private fun createDialog(model: List<ElementModel>) {
        val elementDialogFragment = ElementDialogFragment.newInstance(
            model[adapterPosition].symbol,
            model[adapterPosition].name,
            model[adapterPosition].atomNumber,
            model[adapterPosition].radioactive,
            model[adapterPosition].atomicMass,
            model[adapterPosition].electronConfig
        )
        elementDialogFragment.show(
            dialog.beginTransaction().setCustomAnimations(R.anim.fade_in, R.anim.fade_out),
            "Element Dialog"
        )
    }

    fun bind(element: ElementModel) {
        binding.element = element
        binding.beautification.backgroundConfig(element)
        binding.elementType.setIndicator(element)
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

    private fun View.hideItem(element: ElementModel) {
        if (element.elementType == ElementType.NONE) {
            this.isClickable = false
            this.visibility = View.GONE
        }
    }

}