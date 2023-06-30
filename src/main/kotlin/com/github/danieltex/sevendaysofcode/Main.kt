package com.github.danieltex.sevendaysofcode

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


@Composable
@Preview
fun App() {
    val shawshankRedemptionPoster =
        "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX674_.jpg"
    val padding = 10.dp

    MaterialTheme(
        colors = darkColors()
    ) {
        Surface {
            Box(
                modifier = Modifier.padding(padding).width(200.dp),
            ) {
                Column {
                    Image(
                        bitmap = shawshankRedemptionPoster.loadImageBitmap(),
                        contentDescription = "Shawshank Redemption poster",
                        modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(10.dp))
                    )
                    Row(
                        modifier = Modifier.padding(padding).fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Filled.Star,
                                contentDescription = "Star Icon",
                                tint = Color.Yellow
                            )
                            Text(
                                text = "9.2",
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Text(text = "1994")
                    }
                    Text(
                        text = "The Shawshank Redemption",
                        textAlign = TextAlign.Center
                    )
                }
            }
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
