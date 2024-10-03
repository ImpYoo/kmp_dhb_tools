package de.exhumedo.dhbtools.shared

import io.ktor.client.engine.*
import io.ktor.client.engine.js.*

actual fun provideHttpClientEngine(): HttpClientEngine = Js.create()
