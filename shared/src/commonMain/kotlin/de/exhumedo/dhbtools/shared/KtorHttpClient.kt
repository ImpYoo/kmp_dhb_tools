package de.exhumedo.dhbtools.shared

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class KtorHttpClient(engine: HttpClientEngine) {
    private val client: HttpClient = HttpClient(engine) {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }

    suspend fun exampleGet(id: Int): String {
        return client.get("https://jsonplaceholder.typicode.com/todos/${id}").bodyAsText()
    }
}
