package de.exhumedo.dhbtools.composeApp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "kmp_dhb_tools",
    ) {
        App()
    }
}