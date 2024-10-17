package de.exhumedo.dhbtools.shared.model.response.sportradar.tournaments


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TournamentSeason(
    @SerialName("_id")
    val id: String,
    @SerialName("name")
    val name: String,
    @SerialName("phases")
    val phases: List<TournamentPhase>,
    @SerialName("_sid")
    val sid: String,
    @SerialName("status")
    val status: String,
    @SerialName("year")
    val year: String
)