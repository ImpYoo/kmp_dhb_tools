package de.exhumedo.dhbtools.shared.model.response.sportradar.tournaments


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TournamentsResponse(
    @SerialName("doc")
    val doc: List<TournamentDoc>,
    @SerialName("queryUrl")
    val queryUrl: String
)