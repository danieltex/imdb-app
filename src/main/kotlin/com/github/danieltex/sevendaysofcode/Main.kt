package com.github.danieltex.sevendaysofcode

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    val shawshankRedemptionPoster = "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,3,128,176_AL_.jpg"
    MaterialTheme {
        Column {
            Text("The Shawshank Redemption")
            Image(
                bitmap = shawshankRedemptionPoster.loadImageBitmap(),
                contentDescription = "Shawshank Redemption poster",
                modifier = Modifier.height(200.dp)
            )
            Text("Nota: 9.2 - Ano: 1994")
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "IMDB"
    ) {
        App()
    }
}
