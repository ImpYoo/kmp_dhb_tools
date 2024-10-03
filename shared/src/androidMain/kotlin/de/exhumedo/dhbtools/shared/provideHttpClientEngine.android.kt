package de.exhumedo.dhbtools.shared

import io.ktor.client.engine.*
import io.ktor.client.engine.okhttp.*

actual fun provideHttpClientEngine(): HttpClientEngine = OkHttp.create()
