package de.exhumedo.dhbtools.shared.model.response.sportradar.common


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SportradarDate(
    @SerialName("date")
    val date: String,
    @SerialName("_doc")
    val doc: String,
    @SerialName("time")
    val time: String,
    @SerialName("tz")
    val tz: String,
    @SerialName("tzoffset")
    val tzoffset: Int,
    @SerialName("uts")
    val uts: Int,
    @SerialName("weekday")
    val weekday: String,
    @SerialName("weekday_name")
    val weekdayName: String
)