package com.recep.periodictable.data

import com.recep.periodictable.model.ElementModel
import com.recep.periodictable.model.ElementType

object ElementList {
    fun generateData(): List<ElementModel> {
        val elementList = arrayListOf<ElementModel>()

        val hydrogen = ElementModel("H", "Hydrogen", 1, false, ElementType.AMETAL)
        val lithium = ElementModel("Li", "Lithium", 3, false, ElementType.ALKALI_METAL)
        val sodium = ElementModel("Na", "Sodium", 11, false, ElementType.ALKALI_METAL)
        val potassium = ElementModel("K", "Potassium", 19, false, ElementType.ALKALI_METAL)
        val rubidium = ElementModel("Rb", "Rubidium", 37, false, ElementType.ALKALI_METAL)
        val caesium = ElementModel("Cs", "Caesium", 55, false, ElementType.ALKALI_METAL)
        val francium = ElementModel("Fr", "Francium", 87, true, ElementType.ALKALI_METAL)

        val berilium = ElementModel("Be", "Berilium", 4, false, ElementType.TOPRAK_ALKALI_METAL)
        val magnesium = ElementModel("Mg", "Magnesium", 12, false, ElementType.TOPRAK_ALKALI_METAL)
        val calsium = ElementModel("Ca", "Calsium", 20, false, ElementType.TOPRAK_ALKALI_METAL)
        val strontium = ElementModel("Sr", "Strontium", 38, false, ElementType.TOPRAK_ALKALI_METAL)
        val barium = ElementModel("Ba", "Barium", 56, false, ElementType.TOPRAK_ALKALI_METAL)
        val radium = ElementModel("Ra", "Radium", 88, true, ElementType.TOPRAK_ALKALI_METAL)


        elementList.add(hydrogen)
        elementList.add(lithium)
        elementList.add(sodium)
        elementList.add(potassium)
        elementList.add(rubidium)
        elementList.add(caesium)
        elementList.add(francium)
        elementList.add(berilium)
        elementList.add(magnesium)
        elementList.add(calsium)
        elementList.add(strontium)
        elementList.add(barium)
        elementList.add(radium)

        return elementList
    }
}