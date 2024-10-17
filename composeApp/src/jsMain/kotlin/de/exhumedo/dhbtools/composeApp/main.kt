import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import de.exhumedo.dhbtools.composeApp.App
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
        CanvasBasedWindow("") {
            CompositionLocalProvider(
            ) {
                App()
            }
        }
}

