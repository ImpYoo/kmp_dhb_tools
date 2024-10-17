package de.exhumedo.dhbtools.shared.model.response.sportradar.tournaments


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Tournament(
    @SerialName("abbreviation")
    val abbreviation: String,
    @SerialName("_id")
    val id: String,
    @SerialName("name")
    val name: String,
    @SerialName("seasons")
    val seasons: List<TournamentSeason>,
    @SerialName("_sid")
    val sid: String
)