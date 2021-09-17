package com.recep.periodictable.data

import com.recep.periodictable.model.ElementModel
import com.recep.periodictable.model.ElementType

object ElementList {
    private val elementList = arrayListOf<ElementModel>()

    fun generateData(): List<ElementModel> {
        val none = ElementModel(
            "", "", "", false, ElementType.NONE,
            "0", ""
        )
        val hydrogen = ElementModel(
            "H", "Hydrogen", "1", false, ElementType.NON_METAL,
            "1,008u", "1s1"
        )
        val lithium = ElementModel(
            "Li", "Lithium", "3", false, ElementType.ALKALI_METAL,
            "6,941u", "[He]2s1"
        )
        val sodium = ElementModel(
            "Na", "Sodium", "11", false, ElementType.ALKALI_METAL,
            "22,989u", "[Ne]3s¹"
        )
        val potassium = ElementModel(
            "K", "Potassium", "19", false, ElementType.ALKALI_METAL,
            "39,098u", "[Ar]4s¹"
        )
        val rubidium = ElementModel(
            "Rb", "Rubidium", "37", false, ElementType.ALKALI_METAL,
            "85,467u", "[Kr]5s¹"
        )
        val caesium = ElementModel(
            "Cs", "Caesium", "55", false, ElementType.ALKALI_METAL,
            "132,905u", "[Xe]6s1"
        )
        val francium = ElementModel(
            "Fr", "Francium", "87", true, ElementType.ALKALI_METAL,
            "223u", "[Rn]7s1"
        )
        val beryllium = ElementModel(
            "Be", "Beryllium", "4", false, ElementType.ALKALINE_EARTH_METAL,
            "9,012u", "[He]2s²"
        )
        val magnesium = ElementModel(
            "Mg", "Magnesium", "12", false, ElementType.ALKALINE_EARTH_METAL,
            "24,305u", "[Ne]3s2"
        )
        val calcium = ElementModel(
            "Ca", "Calcium", "20", false, ElementType.ALKALINE_EARTH_METAL,
            "40,078u", "[Ar]4s²"
        )
        val strontium = ElementModel(
            "Sr", "Strontium", "38", false, ElementType.ALKALINE_EARTH_METAL,
            "87,62u", "[Kr]5s2"
        )
        val barium = ElementModel(
            "Ba", "Barium", "56", false, ElementType.ALKALINE_EARTH_METAL,
            "137,327u", "[Xe]6s2"
        )
        val radium = ElementModel(
            "Ra", "Radium", "88", true, ElementType.ALKALINE_EARTH_METAL,
            "226u", "[Rn]7s2"
        )
        val scandium = ElementModel(
            "Sc", "Scandium", "21", false, ElementType.TRANSITION_METAL,
            "44,955u", "[Ar]3d¹ 4s²"
        )
        val yttrium = ElementModel(
            "Y", "Yttrium", "39", false, ElementType.TRANSITION_METAL,
            "88,905u", "[Kr]4d1 5s2"
        )

        val lanthanide = ElementModel("", "Lanthanides", "57-71", false, ElementType.LANTHANIDE)
        val actinide = ElementModel("", "Actinides", "89-103", true, ElementType.ACTINIDE)

        val titanium = ElementModel(
            "Ti", "Titanium", "22", false, ElementType.TRANSITION_METAL,
            "47,867u", "[Ar]3d2 4s2"
        )
        val zirconium = ElementModel(
            "Zr", "Zirconium", "40", false, ElementType.TRANSITION_METAL,
            "91,224u", "[Kr]4d² 5s²"
        )
        val hafnium = ElementModel(
            "Hf", "Hafnium", "72", false, ElementType.TRANSITION_METAL,
            "178,49u", "[Xe]4f¹⁴ 5d² 6s²"
        )
        val rutherfordium = ElementModel(
            "Rf", "Rutherfordium", "104", true, ElementType.TRANSITION_METAL,
            "261u", "[Rn]5f14 6d2 7s2"
        )

        val vanadium = ElementModel(
            "V", "Vanadium", "23", false, ElementType.TRANSITION_METAL,
            "50,941u", "[Ar]3d3 4s2"
        )
        val niobium = ElementModel(
            "Nb", "Niobium", "41", false, ElementType.TRANSITION_METAL,
            "92,906u", "[Kr]4d⁴ 5s¹"
        )
        val tantalum = ElementModel(
            "Ta", "Tantalum", "73", false, ElementType.TRANSITION_METAL,
            "180,947u", "[Xe]4f14 5d3 6s2"
        )
        val dubnium = ElementModel(
            "Db", "Dubnium", "105", true, ElementType.TRANSITION_METAL,
            "262u", "[Rn]5f14 6d3 7s2"
        )

        val chromium = ElementModel(
            "Cr", "Chromium", "24", false, ElementType.TRANSITION_METAL,
            "51,996u", "[Ar]3d⁵ 4s¹"
        )
        val molybdenum = ElementModel(
            "Mo", "Molybdenum", "42", false, ElementType.TRANSITION_METAL,
            "95,95u", "[Kr]4d₅ 5s₁"
        )
        val tungsten = ElementModel(
            "W", "Tungsten", "74", false, ElementType.TRANSITION_METAL,
            "183,84u", "[Xe]6s² 4f¹⁴ 5d⁴"
        )
        val seaborgium = ElementModel(
            "Sg", "Seaborgium", "106", true, ElementType.TRANSITION_METAL,
            "269u", "[Rn]5f14 6d4 7s2"
        )

        val manganese = ElementModel(
            "Mn", "Manganese", "25", false, ElementType.TRANSITION_METAL,
            "54,938u", "[Ar]3d5 4s2"
        )
        val technetium = ElementModel(
            "Tc", "Technetium", "43", true, ElementType.TRANSITION_METAL,
            "98u", "[Kr]4d5 5s2"
        )
        val rhenium = ElementModel(
            "Re", "Rhenium", "75", false, ElementType.TRANSITION_METAL,
            "186,207u", "[Xe]4f14 5d5 6s2"
        )
        val bohrium = ElementModel(
            "Bh", "Bohrium", "107", true, ElementType.TRANSITION_METAL,
            "264u", "[Rn]5f14 6d5 7s2"
        )

        val iron = ElementModel(
            "Fe", "Iron", "26", false, ElementType.TRANSITION_METAL,
            "55,845u", "[Ar]3d6 4s2"
        )
        val ruthenium = ElementModel(
            "Ru", "Ruthenium", "44", false, ElementType.TRANSITION_METAL,
            "101,07u", "[Kr]4d7 5s1"
        )
        val osmium = ElementModel(
            "Os", "Osmium", "76", false, ElementType.TRANSITION_METAL,
            "190,23u", "[Xe]4f14 5d6 6s2"
        )
        val hassium = ElementModel(
            "Hs", "Hassium", "108", true, ElementType.TRANSITION_METAL,
            "269.133u", "[Rn]7s2 5f14 6d6"
        )

        val cobalt = ElementModel(
            "Co", "Cobalt", "27", false, ElementType.TRANSITION_METAL,
            "58.933u", "[Ar]4s2 3d7"
        )
        val rhodium = ElementModel(
            "Rh", "Rhodium", "45", false, ElementType.TRANSITION_METAL,
            "102.905u", "[Kr]5s1 4d8"
        )
        val iridium = ElementModel(
            "Ir", "Iridium", "77", false, ElementType.TRANSITION_METAL,
            "192.22u", "[Xe]6s2 4f14 5d7"
        )
        val meitnerium = ElementModel(
            "Mt", "Meitnerium", "109", true, ElementType.TRANSITION_METAL,
            "277.154u", "[Rn]7s2 5f14 6d7"
        )

        val nickel = ElementModel(
            "Ni", "Nickel", "28", false, ElementType.TRANSITION_METAL,
            "58.693u", "[Ar]4s2 3d8"
        )
        val palladium = ElementModel(
            "Pd", "Palladium", "46", false, ElementType.TRANSITION_METAL,
            "106.42u", "[Kr]4d10"
        )
        val platinum = ElementModel(
            "Pt", "Platinum", "78", false, ElementType.TRANSITION_METAL,
            "195.08u", "[Xe]6s1 4f14 5d9"
        )
        val darmstadtium = ElementModel(
            "Ds", "Darmstadtium", "110", true, ElementType.TRANSITION_METAL,
            "282.166u", "[Rn]7s2 5f14 6d8"
        )

        val copper = ElementModel(
            "Cu", "Copper", "29", false, ElementType.TRANSITION_METAL,
            "63.55u", "[Ar]4s1 3d10"
        )
        val silver = ElementModel(
            "Ag", "Silver", "47", false, ElementType.TRANSITION_METAL,
            "107.868u", "[Kr]5s1 4d10"
        )
        val gold = ElementModel(
            "Au", "Gold", "79", false, ElementType.TRANSITION_METAL,
            "196.966u", "[Xe]6s1 4f14 5d10"
        )
        val roentgenium = ElementModel(
            "Rg", "Roentgenium", "111", true, ElementType.TRANSITION_METAL,
            "282.169u", "[Rn]7s2 5f14 6d9"
        )

        val zinc = ElementModel(
            "Zn", "Zinc", "30", false, ElementType.TRANSITION_METAL,
            "65.4u", "[Ar]4s2 3d10"
        )
        val cadmium = ElementModel(
            "Cd", "Cadmium", "48", false, ElementType.TRANSITION_METAL,
            "112.41u", "[Kr]5s2 4d10"
        )
        val mercury = ElementModel(
            "Hg", "Mercury", "80", false, ElementType.TRANSITION_METAL,
            "200.59u", "[Xe]6s2 4f14 5d10"
        )
        val copernicium = ElementModel(
            "Cn", "Copernicium", "112", true, ElementType.TRANSITION_METAL,
            "286.179u", "[Rn]7s2 5f14 6d10"
        )

        val boron = ElementModel(
            "B", "Boron", "5", false, ElementType.METALOID,
            "10.81u", "[He]2s2 2p1"
        )
        val aluminium = ElementModel(
            "Al", "Aluminium", "13", false, ElementType.METAL,
            "26.981u", "[Ne]3s2 3p1"
        )
        val gallium = ElementModel(
            "Ga", "Gallium", "31", false, ElementType.METAL,
            "69.723u", "[Ar]4s2 3d10 4p1"
        )
        val indium = ElementModel(
            "In", "Indium", "49", false, ElementType.METAL,
            "114.818u", "[Kr]5s2 4d10 5p1"
        )
        val thallium = ElementModel(
            "Tl", "Thallium", "81", false, ElementType.METAL,
            "204.383u", "[Xe]6s2 4f14 5d10 6p1"
        )
        val nihonium = ElementModel(
            "Nh", "Nihonium", "113", false, ElementType.METAL,
            "286.182u", "[Rn]5f14 6d10 7s2 7p1"
        )

        val carbon = ElementModel(
            "C", "Carbon", "6", false, ElementType.NON_METAL,
            "12.011u", "[He]2s2 2p2"
        )
        val silicon = ElementModel(
            "Si", "Silicon", "14", false, ElementType.METALOID,
            "28.085u", "[Ne]3s2 3p2"
        )
        val germanium = ElementModel(
            "Ge", "Germanium", "32", false, ElementType.METALOID,
            "72.63u", "[Ar]4s2 3d10 4p2"
        )
        val tin = ElementModel(
            "Sn", "Tin", "50", false, ElementType.METAL,
            "118.71u", "[Kr]5s2 4d10 5p2"
        )
        val lead = ElementModel(
            "Pb", "Lead", "82", false, ElementType.METAL,
            "207u", "[Xe]6s2 4f14 5d10 6p2"
        )
        val flerovium = ElementModel(
            "Fl", "Flerovium", "114", true, ElementType.METAL,
            "290.192u", "[Rn]7s2 7p2 5f14 6d10"
        )

        val nitrogen = ElementModel(
            "N", "Nitrogen", "7", false, ElementType.NON_METAL,
            "14.007u", "[He]2s2 2p3"
        )
        val phosphorus = ElementModel(
            "P", "Phosphorus", "15", false, ElementType.NON_METAL,
            "30.973u", "[Ne]3s2 3p3"
        )
        val arsenic = ElementModel(
            "As", "Arsenic", "33", false, ElementType.METALOID,
            "74.921u", "[Ar]4s2 3d10 4p3"
        )
        val antimony = ElementModel(
            "Sb", "Antimony", "51", false, ElementType.METALOID,
            "121.760u", "[Kr]5s2 4d10 5p3"
        )
        val bismuth = ElementModel(
            "Bi", "Bismuth", "83", true, ElementType.METAL,
            "208.980u", "[Xe]6s2 4f14 5d10 6p3"
        )
        val moscovium = ElementModel(
            "Mc", "Moscovium", "115", true, ElementType.METAL,
            "290.196u", "[Rn]7s2 7p3 5f14 6d10"
        )

        val oxygen = ElementModel(
            "O", "Oxygen", "8", false, ElementType.NON_METAL,
            "15.999u", "[He]2s2 2p4"
        )
        val sulfur = ElementModel(
            "S", "Sulfur", "16", false, ElementType.NON_METAL,
            "32.07u", "[Ne]3s2 3p4"
        )
        val selenium = ElementModel(
            "Se", "Selenium", "34", false, ElementType.NON_METAL,
            "78.97u", "[Ar]4s2 3d10 4p4"
        )
        val tellurium = ElementModel(
            "Te", "Tellurium", "52", false, ElementType.METALOID,
            "127.6u", "[Kr]5s2 4d10 5p4"
        )
        val polonium = ElementModel(
            "Po", "Polonium", "84", true, ElementType.METALOID,
            "208.982u", "[Xe]6s2 4f14 5d10 6p4"
        )
        val livermorium = ElementModel(
            "Lv", "Livermorium", "116", true, ElementType.METAL,
            "293.205u", "[Rn]7s2 7p4 5f14 6d10"
        )

        val fluorine = ElementModel(
            "F", "Fluorine", "9", false, ElementType.HALOGEN,
            "18.998u", "[He]2s2 2p5"
        )
        val chlorine = ElementModel(
            "Cl", "Chlorine", "17", false, ElementType.HALOGEN,
            "35.45u", "[Ne]3s2 3p5"
        )
        val bromine = ElementModel(
            "Br", "Bromine", "35", false, ElementType.HALOGEN,
            "79.90u", "[Ar]4s2 3d10 4p5"
        )
        val iodine = ElementModel(
            "I", "Iodine", "53", false, ElementType.HALOGEN,
            "126.904u", "[Kr]5s2 4d10 5p5"
        )
        val astatine = ElementModel(
            "At", "Astatine", "85", true, ElementType.HALOGEN,
            "209.987u", "[Xe]6s2 4f14 5d10 6p5"
        )
        val tennessine = ElementModel(
            "Ts", "Tennessine", "117", true, ElementType.HALOGEN,
            "294.211u", "[Rn]7s2 7p5 5f14 6d10"
        )

        val helium = ElementModel(
            "He", "Helium", "2", false, ElementType.NOBLE_GAS,
            "4.0026u", "1s2"
        )
        val neon = ElementModel(
            "Ne", "Neon", "10", false, ElementType.NOBLE_GAS,
            "20.180u", "[He]2s2 2p6"
        )
        val argon = ElementModel(
            "Ar", "Argon", "18", false, ElementType.NOBLE_GAS,
            "39.9u", "[Ne]3s2 3p6"
        )
        val krypton = ElementModel(
            "Kr", "Krypton", "36", false, ElementType.NOBLE_GAS,
            "83.80u", "[Ar]4s2 3d10 4p6"
        )
        val xenon = ElementModel(
            "Xe", "Xenon", "54", false, ElementType.NOBLE_GAS,
            "131.29u", "[Kr]5s2 4d10 5p6"
        )
        val radon = ElementModel(
            "Rn", "Radon", "86", true, ElementType.NOBLE_GAS,
            "222.017u", "[Xe]6s2 4f14 5d10 6p6"
        )
        val oganesson = ElementModel(
            "Og", "Oganesson", "118", true, ElementType.NOBLE_GAS,
            "295.216u", "[Rn]7s2 7p6 5f14 6d10"
        )

        /**
         * lanthanides
         */
        val lanthanum = ElementModel(
            "La", "Lanthanum", "57", false, ElementType.LANTHANIDE,
            "138.9055u", "[Xe]6s2 5d1"
        )
        val cerium = ElementModel(
            "Ce", "Cerium", "58", false, ElementType.LANTHANIDE,
            "140.116u", "[Xe]6s2 4f1 5d1"
        )
        val praseodymium = ElementModel(
            "Pr", "Praseodymium", "59", false, ElementType.LANTHANIDE,
            "140.907u", "[Xe]6s2 4f3"
        )
        val neodymium = ElementModel(
            "Nd", "Neodymium", "60", false, ElementType.LANTHANIDE,
            "144.24u", "[Xe]6s2 4f4"
        )
        val promethium = ElementModel(
            "Pm", "Promethium", "61", true, ElementType.LANTHANIDE,
            "144.912u", "[Xe]6s2 4f5"
        )
        val samarium = ElementModel(
            "Sm", "Samarium", "62", false, ElementType.LANTHANIDE,
            "150.4u", "[Xe]6s2 4f6"
        )
        val europium = ElementModel(
            "Eu", "Europium", "63", false, ElementType.LANTHANIDE,
            "151.964u", "[Xe]6s2 4f7"
        )
        val gadolinium = ElementModel(
            "Gd", "Gadolinium", "64", false, ElementType.LANTHANIDE,
            "157.2u", "[Xe]6s2 4f7 5d1"
        )
        val terbium = ElementModel(
            "Tb", "Terbium", "65", false, ElementType.LANTHANIDE,
            "158.92535u", "[Xe]6s2 4f9"
        )
        val dysprosium = ElementModel(
            "Dy", "Dysprosium", "66", false, ElementType.LANTHANIDE,
            "162.500u", "[Xe]6s2 4f10"
        )
        val holmium = ElementModel(
            "Ho", "Holmium", "67", false, ElementType.LANTHANIDE,
            "164.930u", "[Xe]6s2 4f11"
        )
        val erbium = ElementModel(
            "Er", "Erbium", "68", false, ElementType.LANTHANIDE,
            "167.26u", "[Xe]6s2 4f12"
        )
        val thulium = ElementModel(
            "Tm", "Thulium", "69", false, ElementType.LANTHANIDE,
            "168.934u", "[Xe]6s2 4f13"
        )
        val ytterbium = ElementModel(
            "Tb", "Ytterbium", "70", false, ElementType.LANTHANIDE,
            "173.05u", "[Xe]6s2 4f14"
        )
        val lutetium = ElementModel(
            "Lu", "Lutetium", "71", false, ElementType.LANTHANIDE,
            "174.966u", "[Xe]6s2 4f14 5d1"
        )

        /**
         * actinides
         */
        val actinium = ElementModel(
            "Ac", "Actinium", "89", true, ElementType.ACTINIDE,
            "227.027u", "[Rn]7s2 6d1"
        )
        val thorium = ElementModel(
            "Th", "Thorium", "90", true, ElementType.ACTINIDE,
            "232.038u", "[Rn]7s2 6d2"
        )
        val protactinium = ElementModel(
            "Pa", "Protactinium", "91", true, ElementType.ACTINIDE,
            "231.035u", "[Rn]7s2 5f2 6d1"
        )
        val uranium = ElementModel(
            "U", "Uranium", "92", true, ElementType.ACTINIDE,
            "238.028u", "[Rn]7s2 5f3 6d1"
        )
        val neptunium = ElementModel(
            "Np", "Neptunium", "93", true, ElementType.ACTINIDE,
            "237.048u", "[Rn]7s2 5f4 6d1"
        )
        val plutonium = ElementModel(
            "Pu", "Plutonium", "94", true, ElementType.ACTINIDE,
            "244.064u", "[Rn]7s2 5f6"
        )
        val americium = ElementModel(
            "Am", "Americium", "95", true, ElementType.ACTINIDE,
            "243.061u", "[Rn]7s2 5f7"
        )
        val curium = ElementModel(
            "Cm", "Curium", "96", true, ElementType.ACTINIDE,
            "247.07035u", "[Rn]7s2 5f7 6d1"
        )
        val berkelium = ElementModel(
            "Bk", "Berkelium", "97", true, ElementType.ACTINIDE,
            "247.07u", "[Rn]7s2 5f9"
        )
        val californium = ElementModel(
            "Cf", "Californium", "98", true, ElementType.ACTINIDE, "251.079u", "[Rn]7s2 5f10"
        )
        val einsteinium = ElementModel(
            "Es", "Einsteinium", "99", true, ElementType.ACTINIDE,
            "252.083u", "[Rn]7s2 5f11"
        )
        val fermium = ElementModel(
            "Fm", "Fermium", "100", true, ElementType.ACTINIDE,
            "257.095u", "[Rn]5f12 7s2"
        )
        val mendelevium = ElementModel(
            "Md", "Mendelevium", "101", true, ElementType.ACTINIDE,
            "258.098u", "[Rn]7s2 5f13"
        )
        val nobelium = ElementModel(
            "No", "Nobelium", "102", true, ElementType.ACTINIDE,
            "259.101u", "[Rn]7s2 5f14"
        )
        val lawrencium = ElementModel(
            "Lr", "Lawrencium", "103", true, ElementType.ACTINIDE,
            "266.120u", "[Rn]7s2 5f14 6d1"
        )

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
        elementList.add(none)
        elementList.add(scandium)
        elementList.add(yttrium)
        elementList.add(lanthanide)
        elementList.add(actinide)
        elementList.add(none)
        elementList.add(lanthanum)
        elementList.add(actinium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(titanium)
        elementList.add(zirconium)
        elementList.add(hafnium)
        elementList.add(rutherfordium)
        elementList.add(none)
        elementList.add(cerium)
        elementList.add(thorium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(vanadium)
        elementList.add(niobium)
        elementList.add(tantalum)
        elementList.add(dubnium)
        elementList.add(none)
        elementList.add(praseodymium)
        elementList.add(protactinium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(chromium)
        elementList.add(molybdenum)
        elementList.add(tungsten)
        elementList.add(seaborgium)
        elementList.add(none)
        elementList.add(neodymium)
        elementList.add(uranium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(manganese)
        elementList.add(technetium)
        elementList.add(rhenium)
        elementList.add(bohrium)
        elementList.add(none)
        elementList.add(promethium)
        elementList.add(neptunium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(iron)
        elementList.add(ruthenium)
        elementList.add(osmium)
        elementList.add(hassium)
        elementList.add(none)
        elementList.add(samarium)
        elementList.add(plutonium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(cobalt)
        elementList.add(rhodium)
        elementList.add(iridium)
        elementList.add(meitnerium)
        elementList.add(none)
        elementList.add(europium)
        elementList.add(americium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(nickel)
        elementList.add(palladium)
        elementList.add(platinum)
        elementList.add(darmstadtium)
        elementList.add(none)
        elementList.add(gadolinium)
        elementList.add(curium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(copper)
        elementList.add(silver)
        elementList.add(gold)
        elementList.add(roentgenium)
        elementList.add(none)
        elementList.add(terbium)
        elementList.add(berkelium)

        elementList.add(none)
        elementList.add(none)
        elementList.add(none)
        elementList.add(zinc)
        elementList.add(cadmium)
        elementList.add(mercury)
        elementList.add(copernicium)
        elementList.add(none)
        elementList.add(dysprosium)
        elementList.add(californium)

        elementList.add(none)
        elementList.add(boron)
        elementList.add(aluminium)
        elementList.add(gallium)
        elementList.add(indium)
        elementList.add(thallium)
        elementList.add(nihonium)
        elementList.add(none)
        elementList.add(holmium)
        elementList.add(einsteinium)

        elementList.add(none)
        elementList.add(carbon)
        elementList.add(silicon)
        elementList.add(germanium)
        elementList.add(tin)
        elementList.add(lead)
        elementList.add(flerovium)
        elementList.add(none)
        elementList.add(erbium)
        elementList.add(fermium)

        elementList.add(none)
        elementList.add(nitrogen)
        elementList.add(phosphorus)
        elementList.add(arsenic)
        elementList.add(antimony)
        elementList.add(bismuth)
        elementList.add(moscovium)
        elementList.add(none)
        elementList.add(thulium)
        elementList.add(mendelevium)

        elementList.add(none)
        elementList.add(oxygen)
        elementList.add(sulfur)
        elementList.add(selenium)
        elementList.add(tellurium)
        elementList.add(polonium)
        elementList.add(livermorium)
        elementList.add(none)
        elementList.add(ytterbium)
        elementList.add(nobelium)

        elementList.add(none)
        elementList.add(fluorine)
        elementList.add(chlorine)
        elementList.add(bromine)
        elementList.add(iodine)
        elementList.add(astatine)
        elementList.add(tennessine)
        elementList.add(none)
        elementList.add(lutetium)
        elementList.add(lawrencium)

        elementList.add(helium)
        elementList.add(neon)
        elementList.add(argon)
        elementList.add(krypton)
        elementList.add(xenon)
        elementList.add(radon)
        elementList.add(oganesson)

        return elementList
    }
}