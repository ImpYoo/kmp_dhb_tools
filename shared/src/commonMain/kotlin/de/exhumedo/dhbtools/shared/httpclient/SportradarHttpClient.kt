package de.exhumedo.dhbtools.shared.httpclient

import de.exhumedo.dhbtools.shared.model.response.sportradar.tournaments.TournamentsResponse
import io.ktor.client.call.body
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

class SportradarHttpClient(
    private val baseUrl: String,
    engine: HttpClientEngine
) : KtorHttpClient(engine = engine) {

    private val basePath = "/feeds/internal/de/Europe:Berlin/gismo"
    private val baseUrlWithBasePath = "${this.baseUrl}${basePath}"
    private val fixturesUrl = "$baseUrlWithBasePath/fixtures"
    private val standingsUrl = "$baseUrlWithBasePath/standings"
    private val tournamentsUrl = "$baseUrlWithBasePath/tournaments"

    suspend fun getFixtures(seasonId: Int, tournamentId: Int) {
        client.get("$fixturesUrl/$tournamentId/${seasonId}").bodyAsText()
    }

    suspend fun getStandings(phaseId: Int) {
        client.get("$standingsUrl/$phaseId").bodyAsText()
    }

    suspend fun getTournaments(): TournamentsResponse {
        return client.get(tournamentsUrl).body<TournamentsResponse>()
    }
}