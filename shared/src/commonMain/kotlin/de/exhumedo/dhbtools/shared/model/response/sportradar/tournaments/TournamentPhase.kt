package de.exhumedo.dhbtools.shared.model.response.sportradar.tournaments


import SportradarDateSerializer
import de.exhumedo.dhbtools.shared.model.response.sportradar.common.SportradarDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TournamentPhase(
    @SerialName("abbreviation")
    val abbreviation: String,
    @SerialName("end_date")
    @Serializable(with = SportradarDateSerializer::class)
    val endDate: SportradarDate?,
    @SerialName("_id")
    val id: String,
    @SerialName("name")
    val name: String,
    @SerialName("_sid")
    val sid: String,
    @SerialName("special_table_positions")
    val specialTablePositions: String,
    @SerialName("start_date")
    @Serializable(with = SportradarDateSerializer::class)
    val startDate: SportradarDate?,
    @SerialName("structured_special_table_positions")
    val structuredSpecialTablePositions: List<StructuredSpecialTablePosition>
)