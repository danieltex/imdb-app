import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column {
            Text("The Shawshank Redemption")
            Image(
                painter = painterResource("Shawshank_Redemption.jpg"),
                contentDescription = "Shawshank Redemption poster",
                modifier = Modifier.fillMaxSize()
            )
            Text("Nota: 9.2 - Ano: 1994")
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
