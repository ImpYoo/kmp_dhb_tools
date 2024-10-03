package de.exhumedo.dhbtools.composeApp.di

import de.exhumedo.dhbtools.shared.KtorHttpClient
import de.exhumedo.dhbtools.shared.provideHttpClientEngine
import org.koin.dsl.module

val commonModule = module {
    single { provideHttpClientEngine() }
    single { KtorHttpClient(engine = get()) }
}
