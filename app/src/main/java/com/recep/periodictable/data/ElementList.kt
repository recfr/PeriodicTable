package com.recep.periodictable.data

import com.recep.periodictable.model.ElementModel
import com.recep.periodictable.model.ElementType

class ElementList {
    fun generateData(): List<ElementModel> {
        val elementList = arrayListOf<ElementModel>()

        val none = ElementModel("", "", 0, false, ElementType.NONE)
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
        val scandium = ElementModel("Sc", "Scandium", 21, false, ElementType.GECIS_METALLERI)
        val yttrium = ElementModel("Y", "Yttrium", 39, false, ElementType.GECIS_METALLERI)
        // 57-71 Lantanitler
        // 89-103 Aktanitler

        val titanium = ElementModel("Ti", "Titanium", 22, false, ElementType.GECIS_METALLERI)
        val zirconium = ElementModel("Zr", "Zirconium", 40, false, ElementType.GECIS_METALLERI)
        val hafnium = ElementModel("Hf", "Hafnium", 72, false, ElementType.GECIS_METALLERI)
        val rutherfordium = ElementModel("Rf", "Rutherfordium", 104, true, ElementType.GECIS_METALLERI)

        val vanadium = ElementModel("V", "Vanadium", 23, false, ElementType.GECIS_METALLERI)
        val niobium = ElementModel("Nb", "Niobium", 41, false, ElementType.GECIS_METALLERI)
        val tantalum = ElementModel("Ta", "Tantalum", 73, false, ElementType.GECIS_METALLERI)
        val dubnium = ElementModel("Db", "Dubnium", 105, true, ElementType.GECIS_METALLERI)

        val chromium = ElementModel("Cr", "Chromium", 24, false, ElementType.GECIS_METALLERI)
        val molybdenum = ElementModel("Mo", "Molybdenum", 42, false, ElementType.GECIS_METALLERI)
        val tungsten = ElementModel("W", "Tungsten", 74, false, ElementType.GECIS_METALLERI)
        val seaborgium = ElementModel("Sg", "Seaborgium", 106, true, ElementType.GECIS_METALLERI)

        val manganese = ElementModel("Mn", "Manganese", 25, false, ElementType.GECIS_METALLERI)
        val technetium = ElementModel("Tc", "Technetium", 43, true, ElementType.GECIS_METALLERI)
        val rhenium = ElementModel("Re", "Rhenium", 75, false, ElementType.GECIS_METALLERI)
        val bohrium = ElementModel("Bh", "Bohrium", 107, true, ElementType.GECIS_METALLERI)

        val iron = ElementModel("Fe", "Iron", 26, false, ElementType.GECIS_METALLERI)
        val ruthenium = ElementModel("Ru", "Ruthenium", 44, false, ElementType.GECIS_METALLERI)
        val osmium = ElementModel("Os", "Osmium", 76, false, ElementType.GECIS_METALLERI)
        val hassium = ElementModel("Hs", "Hassium", 108, true, ElementType.GECIS_METALLERI)

        val cobalt = ElementModel("Co", "Cobalt", 27, false, ElementType.GECIS_METALLERI)
        val rhodium = ElementModel("Rh", "Rhodium", 45, false, ElementType.GECIS_METALLERI)
        val iridium = ElementModel("Ir", "Iridium", 77, false, ElementType.GECIS_METALLERI)
        val meitnerium = ElementModel("Mt", "Meitnerium", 109, true, ElementType.GECIS_METALLERI)

        val nickel = ElementModel("Ni", "Nickel", 28, false, ElementType.GECIS_METALLERI)
        val palladium = ElementModel("Pd", "Palladium", 46, false, ElementType.GECIS_METALLERI)
        val platinum = ElementModel("Pt", "Platinum", 46, false, ElementType.GECIS_METALLERI)
        val darmstadtium = ElementModel("Ds", "Darmstadtium", 110, true, ElementType.GECIS_METALLERI)


        elementList.add(hydrogen)
        elementList.add(lithium)
        elementList.add(sodium)
        elementList.add(potassium)
        elementList.add(rubidium)
        elementList.add(caesium)
        elementList.add(francium)

        elementList.add(none)
        elementList.add(berilium)
        elementList.add(magnesium)
        elementList.add(calsium)
        elementList.add(strontium)
        elementList.add(barium)
        elementList.add(radium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(scandium)
        elementList.add(yttrium)
        elementList.add(none)   // 57-71 Lantanitler
        elementList.add(none)   // 89-103 Aktanitler

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(titanium)
        elementList.add(zirconium)
        elementList.add(hafnium)
        elementList.add(rutherfordium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(vanadium)
        elementList.add(niobium)
        elementList.add(tantalum)
        elementList.add(dubnium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(chromium)
        elementList.add(molybdenum)
        elementList.add(tungsten)
        elementList.add(seaborgium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(manganese)
        elementList.add(technetium)
        elementList.add(rhenium)
        elementList.add(bohrium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(iron)
        elementList.add(ruthenium)
        elementList.add(osmium)
        elementList.add(hassium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(cobalt)
        elementList.add(rhodium)
        elementList.add(iridium)
        elementList.add(meitnerium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(nickel)
        elementList.add(palladium)
        elementList.add(platinum)
        elementList.add(darmstadtium)

        return elementList
    }
}