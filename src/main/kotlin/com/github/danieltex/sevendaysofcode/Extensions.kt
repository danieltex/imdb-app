package com.github.danieltex.sevendaysofcode

import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import org.jetbrains.skia.Image
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers
import java.time.Duration


fun String.loadImageBitmap(): ImageBitmap {
    val request = HttpRequest.newBuilder()
        .uri(URI.create(this))
        .GET()
        .build()

    val client = HttpClient.newBuilder()
        .followRedirects(HttpClient.Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(20))
        .build()
    val response = client.send(request, BodyHandlers.ofByteArray())

    return Image.makeFromEncoded(response.body())
        .toComposeImageBitmap()
}