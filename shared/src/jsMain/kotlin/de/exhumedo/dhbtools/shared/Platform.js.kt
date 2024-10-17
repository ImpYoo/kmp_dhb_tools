package de.exhumedo.dhbtools.shared

class JSPlatform: Platform {
    override val name: String = "vanilla"
}

actual fun getPlatform(): Platform = JSPlatform()
