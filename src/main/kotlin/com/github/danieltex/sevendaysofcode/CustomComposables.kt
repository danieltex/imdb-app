package com.github.danieltex.sevendaysofcode

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.github.danieltex.sevendaysofcode.model.Movie


@Composable
fun MovieItem(movie: Movie) {
    val padding = 16.dp
    val bitmap = movie.image.loadImageBitmap()
    val width = 200
    Box(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.width(width.dp).padding(padding)
        ) {
            Image(
                bitmap = bitmap,
                contentDescription = "Movie poster",
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(4.dp))
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(padding),
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
                        text = movie.rating,
                        fontWeight = FontWeight.Bold
                    )
                }
                Text(text = movie.year)
            }
            Text(
                text = movie.title,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Thin
            )
        }
    }
}