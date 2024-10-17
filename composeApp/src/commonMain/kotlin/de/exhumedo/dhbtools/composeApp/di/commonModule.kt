package de.exhumedo.dhbtools.composeApp.di

import de.exhumedo.dhbtools.shared.httpclient.SportradarHttpClient
import de.exhumedo.dhbtools.shared.provideHttpClientEngine
import org.koin.core.qualifier.Qualifier
import org.koin.core.qualifier.QualifierValue
import org.koin.dsl.module

object DHBHttpClient : Qualifier {
    override val value: QualifierValue
        get() = "https://dhbdata.fmp.sportradar.com"
}

object HBLHttpClient : Qualifier {
    override val value: QualifierValue
        get() = "https://hbl.fmp.sportradar.com"
}

val commonModule = module {
    single { provideHttpClientEngine() }

    single(DHBHttpClient) {
        SportradarHttpClient(
            baseUrl = DHBHttpClient.value,
            engine = get()
        )
    }

    single(HBLHttpClient) {
        SportradarHttpClient(
            baseUrl = HBLHttpClient.value,
            engine = get()
        )
    }
}
