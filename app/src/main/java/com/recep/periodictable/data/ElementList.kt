package com.recep.periodictable.data

import android.sax.Element
import com.recep.periodictable.model.ElementModel
import com.recep.periodictable.model.ElementType

class ElementList {
    fun generateData(): List<ElementModel> {
        val elementList = arrayListOf<ElementModel>()

        val none = ElementModel("", "", "", false, ElementType.NONE)
        val hydrogen = ElementModel("H", "Hydrogen", "1", false, ElementType.NON_METAL)
        val lithium = ElementModel("Li", "Lithium", "3", false, ElementType.ALKALI_METAL)
        val sodium = ElementModel("Na", "Sodium", "11", false, ElementType.ALKALI_METAL)
        val potassium = ElementModel("K", "Potassium", "19", false, ElementType.ALKALI_METAL)
        val rubidium = ElementModel("Rb", "Rubidium", "37", false, ElementType.ALKALI_METAL)
        val caesium = ElementModel("Cs", "Caesium", "55", false, ElementType.ALKALI_METAL)
        val francium = ElementModel("Fr", "Francium", "87", true, ElementType.ALKALI_METAL)

        val beryllium = ElementModel("Be", "Beryllium", "4", false, ElementType.ALKALINE_EARTH_METAL)
        val magnesium = ElementModel("Mg", "Magnesium", "12", false, ElementType.ALKALINE_EARTH_METAL)
        val calcium = ElementModel("Ca", "Calcium", "20", false, ElementType.ALKALINE_EARTH_METAL)
        val strontium = ElementModel("Sr", "Strontium", "38", false, ElementType.ALKALINE_EARTH_METAL)
        val barium = ElementModel("Ba", "Barium", "56", false, ElementType.ALKALINE_EARTH_METAL)
        val radium = ElementModel("Ra", "Radium", "88", true, ElementType.ALKALINE_EARTH_METAL)
        val scandium = ElementModel("Sc", "Scandium", "21", false, ElementType.TRANSITION_METAL)
        val yttrium = ElementModel("Y", "Yttrium", "39", false, ElementType.TRANSITION_METAL)

        val lanthanide = ElementModel("", "Lanthanides", "57-71", false, ElementType.LANTHANIDE)
        val actinide = ElementModel("", "Actinides", "89-103", false, ElementType.ACTINIDE)

        val titanium = ElementModel("Ti", "Titanium", "22", false, ElementType.TRANSITION_METAL)
        val zirconium = ElementModel("Zr", "Zirconium", "40", false, ElementType.TRANSITION_METAL)
        val hafnium = ElementModel("Hf", "Hafnium", "72", false, ElementType.TRANSITION_METAL)
        val rutherfordium = ElementModel("Rf", "Rutherfordium", "104", true, ElementType.TRANSITION_METAL)

        val vanadium = ElementModel("V", "Vanadium", "23", false, ElementType.TRANSITION_METAL)
        val niobium = ElementModel("Nb", "Niobium", "41", false, ElementType.TRANSITION_METAL)
        val tantalum = ElementModel("Ta", "Tantalum", "73", false, ElementType.TRANSITION_METAL)
        val dubnium = ElementModel("Db", "Dubnium", "105", true, ElementType.TRANSITION_METAL)

        val chromium = ElementModel("Cr", "Chromium", "24", false, ElementType.TRANSITION_METAL)
        val molybdenum = ElementModel("Mo", "Molybdenum", "42", false, ElementType.TRANSITION_METAL)
        val tungsten = ElementModel("W", "Tungsten", "74", false, ElementType.TRANSITION_METAL)
        val seaborgium = ElementModel("Sg", "Seaborgium", "106", true, ElementType.TRANSITION_METAL)

        val manganese = ElementModel("Mn", "Manganese", "25", false, ElementType.TRANSITION_METAL)
        val technetium = ElementModel("Tc", "Technetium", "43", true, ElementType.TRANSITION_METAL)
        val rhenium = ElementModel("Re", "Rhenium", "75", false, ElementType.TRANSITION_METAL)
        val bohrium = ElementModel("Bh", "Bohrium", "107", true, ElementType.TRANSITION_METAL)

        val iron = ElementModel("Fe", "Iron", "26", false, ElementType.TRANSITION_METAL)
        val ruthenium = ElementModel("Ru", "Ruthenium", "44", false, ElementType.TRANSITION_METAL)
        val osmium = ElementModel("Os", "Osmium", "76", false, ElementType.TRANSITION_METAL)
        val hassium = ElementModel("Hs", "Hassium", "108", true, ElementType.TRANSITION_METAL)

        val cobalt = ElementModel("Co", "Cobalt", "27", false, ElementType.TRANSITION_METAL)
        val rhodium = ElementModel("Rh", "Rhodium", "45", false, ElementType.TRANSITION_METAL)
        val iridium = ElementModel("Ir", "Iridium", "77", false, ElementType.TRANSITION_METAL)
        val meitnerium = ElementModel("Mt", "Meitnerium", "109", true, ElementType.TRANSITION_METAL)

        val nickel = ElementModel("Ni", "Nickel", "28", false, ElementType.TRANSITION_METAL)
        val palladium = ElementModel("Pd", "Palladium", "46", false, ElementType.TRANSITION_METAL)
        val platinum = ElementModel("Pt", "Platinum", "78", false, ElementType.TRANSITION_METAL)
        val darmstadtium = ElementModel("Ds", "Darmstadtium", "110", true, ElementType.TRANSITION_METAL)

        val copper = ElementModel("Cu", "Copper", "29", false, ElementType.TRANSITION_METAL)
        val silver = ElementModel("Ag", "Silver", "47", false, ElementType.TRANSITION_METAL)
        val gold = ElementModel("Au", "Gold", "79", false, ElementType.TRANSITION_METAL)
        val roentgenium = ElementModel("Rg", "Roentgenium", "111", true, ElementType.TRANSITION_METAL)

        val zinc = ElementModel("Zn", "Zinc", "30", false, ElementType.TRANSITION_METAL)
        val cadmium = ElementModel("Cd", "Cadmium", "48", false, ElementType.TRANSITION_METAL)
        val mercury = ElementModel("Hg", "Mercury", "80", false, ElementType.TRANSITION_METAL)
        val copernicium = ElementModel("Cn", "Copernicium", "112", true, ElementType.TRANSITION_METAL)

        val boron = ElementModel("B", "Boron", "5", false, ElementType.METALOID)
        val aluminium = ElementModel("Al", "Aluminium", "13", false, ElementType.METAL)
        val gallium = ElementModel("Ga", "Gallium", "31", false, ElementType.METAL)
        val indium = ElementModel("In", "Indium", "49", false, ElementType.METAL)
        val thallium = ElementModel("Tl", "Thallium", "81", false, ElementType.METAL)
        val nihonium = ElementModel("Nh", "Nihonium", "113", false, ElementType.METAL)

        val carbon = ElementModel("C", "Carbon", "6", false, ElementType.NON_METAL)
        val silicon = ElementModel("Si", "Silicon", "14", false, ElementType.METALOID)
        val germanium = ElementModel("Ge", "Germanium", "32", false, ElementType.METALOID)
        val tin = ElementModel("Sn", "Tin", "50", false, ElementType.METAL)
        val lead = ElementModel("Pb", "Lead", "82", false, ElementType.METAL)
        val flerovium = ElementModel("Fl", "flerovium", "114", true, ElementType.METAL)

        val nitrogen = ElementModel("N", "Nitrogen", "7", false, ElementType.NON_METAL)
        val phosphorus = ElementModel("P", "Phosphorus", "15", false, ElementType.NON_METAL)
        val arsenic = ElementModel("As", "Arsenic", "33", false, ElementType.METALOID)
        val antimony = ElementModel("Sb", "Antimony", "51", false, ElementType.METALOID)
        val bismuth = ElementModel("Bi", "Bismuth", "83", true, ElementType.METAL)
        val moscovium = ElementModel("Mc", "Moscovium", "115", true, ElementType.METAL)

        val oxygen = ElementModel("O", "Oxygen", "8", false, ElementType.NON_METAL)
        val sulfur = ElementModel("S", "Sulfur", "16", false, ElementType.NON_METAL)
        val selenium = ElementModel("Se", "Selenium", "34", false, ElementType.NON_METAL)
        val tellurium = ElementModel("Te", "Tellurium", "52", false, ElementType.METALOID)
        val polonium = ElementModel("Po", "Polonium", "84", true, ElementType.METALOID)
        val livermorium = ElementModel("Lv", "Livermorium", "116", true, ElementType.METAL)

        val fluorine = ElementModel("F", "Fluorine", "9", false, ElementType.HALOGEN)
        val chlorine = ElementModel("Cl", "Chlorine", "17", false, ElementType.HALOGEN)
        val bromine = ElementModel("Br", "Bromine", "35", false, ElementType.HALOGEN)
        val iodine = ElementModel("I", "Iodine", "53", false, ElementType.HALOGEN)
        val astatine = ElementModel("At", "Astatine", "85", true, ElementType.HALOGEN)
        val tennessine = ElementModel("Ts", "Tennessine", "117", true, ElementType.HALOGEN)

        val helium = ElementModel("He", "Helium", "2", false, ElementType.NOBLE_GAS)
        val neon = ElementModel("Ne", "Neon", "10", false, ElementType.NOBLE_GAS)
        val argon = ElementModel("Ar", "Argon", "18", false, ElementType.NOBLE_GAS)
        val krypton = ElementModel("Kr", "Krypton", "36", false, ElementType.NOBLE_GAS)
        val xenon = ElementModel("Xe", "Xenon", "54", false, ElementType.NOBLE_GAS)
        val radon = ElementModel("Rn", "Radon", "86", true, ElementType.NOBLE_GAS)
        val oganesson = ElementModel("Og", "Oganesson", "118", true, ElementType.NOBLE_GAS)

        /**
         * lanthanides
         */
        val lanthanum = ElementModel("La", "Lanthanum", "57", false, ElementType.LANTHANIDE)
        val cerium = ElementModel("Ce", "Cerium", "58", false, ElementType.LANTHANIDE)
        val praseodymium = ElementModel("Pr", "Praseodymium", "59", false, ElementType.LANTHANIDE)
        val neodymium = ElementModel("Nd", "Neodymium", "60", false, ElementType.LANTHANIDE)
        val promethium = ElementModel("Pm", "Promethium", "61", true, ElementType.LANTHANIDE)
        val samarium = ElementModel("Sm", "Samarium", "62", false, ElementType.LANTHANIDE)
        val europium = ElementModel("Eu", "Europium", "63", false, ElementType.LANTHANIDE)
        val gadolinium = ElementModel("Gd", "Gadolinium", "64", false, ElementType.LANTHANIDE)
        val terbium = ElementModel("Tb", "Terbium", "65", false, ElementType.LANTHANIDE)
        val dysprosium = ElementModel("Dy", "Dysprosium", "66", false, ElementType.LANTHANIDE)
        val holmium = ElementModel("Ho", "Holmium", "67", false, ElementType.LANTHANIDE)
        val erbium = ElementModel("Er", "Erbium", "68", false, ElementType.LANTHANIDE)
        val thulium = ElementModel("Tm", "Thulium", "69", false, ElementType.LANTHANIDE)
        val ytterbium = ElementModel("Tb", "Ytterbium", "70", false, ElementType.LANTHANIDE)
        val lutetium = ElementModel("Lu", "Lutetium", "71", false, ElementType.LANTHANIDE)

        /**
         * actinides
         */
        val actinium = ElementModel("Ac", "Actinium", "89", true, ElementType.ACTINIDE)
        val thorium = ElementModel("Th", "Thorium", "90", true, ElementType.ACTINIDE)
        val protactinium = ElementModel("Pa", "Protactinium", "91", true, ElementType.ACTINIDE)
        val uranium = ElementModel("U", "Uranium", "92", true, ElementType.ACTINIDE)
        val neptunium = ElementModel("Np", "Neptunium", "93", true, ElementType.ACTINIDE)
        val plutonium = ElementModel("Pu", "Plutonium", "94", true, ElementType.ACTINIDE)
        val americium = ElementModel("Am", "Americium", "95", true, ElementType.ACTINIDE)
        val curium = ElementModel("Cm", "Curium", "96", true, ElementType.ACTINIDE)
        val berkelium = ElementModel("Bk", "Berkelium", "97", true, ElementType.ACTINIDE)
        val californium = ElementModel("Cf", "Californium", "98", true, ElementType.ACTINIDE)
        val einsteinium = ElementModel("Es", "Einsteinium", "99", true, ElementType.ACTINIDE)
        val fermium = ElementModel("Fm", "Fermium", "100", true, ElementType.ACTINIDE)
        val mendelevium = ElementModel("Md", "Mendelevium", "101", true, ElementType.ACTINIDE)
        val nobelium = ElementModel("No", "Nobelium", "102", true, ElementType.ACTINIDE)
        val lawrencium = ElementModel("Lr", "Lawrencium", "103", true, ElementType.ACTINIDE)

        elementList.add(hydrogen)
        elementList.add(lithium)
        elementList.add(sodium)
        elementList.add(potassium)
        elementList.add(rubidium)
        elementList.add(caesium)
        elementList.add(francium)
        elementList.add(none)
        elementList.add(none)

        elementList.add(none)
        elementList.add(beryllium)
        elementList.add(magnesium)
        elementList.add(calcium)
        elementList.add(strontium)
        elementList.add(barium)
        elementList.add(radium)
        elementList.add(none)
        elementList.add(none)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(scandium)
        elementList.add(yttrium)
        elementList.add(lanthanide)
        elementList.add(actinide)
        elementList.add(none)
        elementList.add(lanthanum)


        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(titanium)
        elementList.add(zirconium)
        elementList.add(hafnium)
        elementList.add(rutherfordium)
        elementList.add(none)
        elementList.add(cerium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(vanadium)
        elementList.add(niobium)
        elementList.add(tantalum)
        elementList.add(dubnium)
        elementList.add(none)
        elementList.add(praseodymium)


        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(chromium)
        elementList.add(molybdenum)
        elementList.add(tungsten)
        elementList.add(seaborgium)
        elementList.add(none)
        elementList.add(neodymium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(manganese)
        elementList.add(technetium)
        elementList.add(rhenium)
        elementList.add(bohrium)
        elementList.add(none)
        elementList.add(promethium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(iron)
        elementList.add(ruthenium)
        elementList.add(osmium)
        elementList.add(hassium)
        elementList.add(none)
        elementList.add(samarium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(cobalt)
        elementList.add(rhodium)
        elementList.add(iridium)
        elementList.add(meitnerium)
        elementList.add(none)
        elementList.add(europium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(nickel)
        elementList.add(palladium)
        elementList.add(platinum)
        elementList.add(darmstadtium)
        elementList.add(none)
        elementList.add(gadolinium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(copper)
        elementList.add(silver)
        elementList.add(gold)
        elementList.add(roentgenium)
        elementList.add(none)
        elementList.add(terbium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(zinc)
        elementList.add(cadmium)
        elementList.add(mercury)
        elementList.add(copernicium)
        elementList.add(none)
        elementList.add(dysprosium)

        elementList.add(none)
        elementList.add(boron)
        elementList.add(aluminium)
        elementList.add(gallium)
        elementList.add(indium)
        elementList.add(thallium)
        elementList.add(nihonium)
        elementList.add(none)
        elementList.add(holmium)

        elementList.add(none)
        elementList.add(carbon)
        elementList.add(silicon)
        elementList.add(germanium)
        elementList.add(tin)
        elementList.add(lead)
        elementList.add(flerovium)
        elementList.add(none)
        elementList.add(erbium)

        elementList.add(none)
        elementList.add(nitrogen)
        elementList.add(phosphorus)
        elementList.add(arsenic)
        elementList.add(antimony)
        elementList.add(bismuth)
        elementList.add(moscovium)
        elementList.add(none)
        elementList.add(thulium)

        elementList.add(none)
        elementList.add(oxygen)
        elementList.add(sulfur)
        elementList.add(selenium)
        elementList.add(tellurium)
        elementList.add(polonium)
        elementList.add(livermorium)
        elementList.add(none)
        elementList.add(ytterbium)

        elementList.add(none)
        elementList.add(fluorine)
        elementList.add(chlorine)
        elementList.add(bromine)
        elementList.add(iodine)
        elementList.add(astatine)
        elementList.add(tennessine)
        elementList.add(none)
        elementList.add(lutetium)

        elementList.add(helium)
        elementList.add(neon)
        elementList.add(argon)
        elementList.add(krypton)
        elementList.add(xenon)
        elementList.add(radon)
        elementList.add(oganesson)
        elementList.add(none)

        return elementList
    }
}