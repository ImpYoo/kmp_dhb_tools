package de.exhumedo.dhbtools.shared.model.response.sportradar.tournaments


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TournamentDoc(
    @SerialName("data")
    val `data`: TournamentData,
    @SerialName("_dob")
    val dob: Int,
    @SerialName("_maxage")
    val maxage: Int
)