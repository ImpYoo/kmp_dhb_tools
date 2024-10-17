package de.exhumedo.dhbtools.shared.model.response.sportradar.tournaments


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TournamentData(
    @SerialName("tournaments")
    val tournaments: List<Tournament>
)