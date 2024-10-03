package de.exhumedo.dhbtools.shared

import io.ktor.client.engine.*
import io.ktor.client.engine.darwin.*

actual fun provideHttpClientEngine(): HttpClientEngine = Darwin.create()
