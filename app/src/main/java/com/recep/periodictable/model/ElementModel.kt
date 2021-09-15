package com.recep.periodictable.model

data class ElementModel(
    val symbol: String,
    val name: String,
    val atomNumber: String,
    val radioactive: Boolean,
    val elementType: ElementType
)

enum class ElementType() {
    ALKALI_METAL,
    ALKALINE_EARTH_METAL,
    TRANSITION_METAL,
    METAL,
    METALOID,
    NON_METAL,
    HALOGEN,
    NOBLE_GAS,
    LANTHANIDE,
    ACTINIDE,
    NONE
}