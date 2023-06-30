package com.github.danieltex.sevendaysofcode

import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import org.jetbrains.skia.Image
import java.io.BufferedInputStream
import java.net.URL


fun String.loadImageBitmap(): ImageBitmap {
    val bytes = BufferedInputStream(
        URL(this).openStream()
    ).use { it.readAllBytes() }

    return Image.makeFromEncoded(bytes)
        .toComposeImageBitmap()
}