package com.recep.periodictable.model

import com.recep.periodictable.enum.ElementType

data class ElementModel(
    val symbol: String,
    val name: String,
    val atomNumber: String,
    val radioactive: Boolean,
    val elementType: ElementType,
    val atomicMass: String = "",
    val electronConfig: String = ""
)