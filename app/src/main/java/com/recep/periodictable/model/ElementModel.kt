package com.recep.periodictable.model

data class ElementModel(
    val symbol: String,
    val name: String,
    val atomNumber: Int,
    val radioactive: Boolean,
    val elementType: ElementType
)

enum class ElementType() {
    ALKALI_METAL,
    TOPRAK_ALKALI_METAL,
    GECIS_METALLERI,
    ZAYIF_METALLER,
    YARI_METAL,

    AMETAL,
    HALOJENLER,
    SOYGAZ,
    LANTANITLER,
    AKTINITLER,
    NONE
}