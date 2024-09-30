package de.exhumedo.dhbtools.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform


