package com.recep.periodictable.model

data class ElementModel(
    val symbol: String,
    val name: String,
    val atomNumber: Int,
    val radioactive: Boolean,
    val elementType: ElementType
)

enum class ElementType() {
    YARIMETAL,
    AMETAL,
    ALKALI_METAL,
    TOPRAK_ALKALI_METAL,
    YARI_METAL,
    GECIS_METALLERI,
    HALOJENLER,
    SOYGAZ,
    SUPERAKTINITLER,
    LANTANITLER,
    AKTINITLER
}