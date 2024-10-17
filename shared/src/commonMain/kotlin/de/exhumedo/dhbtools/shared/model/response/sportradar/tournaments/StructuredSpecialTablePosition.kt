package de.exhumedo.dhbtools.shared.model.response.sportradar.tournaments


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StructuredSpecialTablePosition(
    @SerialName("color")
    val color: String,
    @SerialName("label")
    val label: String,
    @SerialName("label_en")
    val labelEn: String,
    @SerialName("rows")
    val rows: List<Int>
)