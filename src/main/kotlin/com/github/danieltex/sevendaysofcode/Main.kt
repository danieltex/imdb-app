package com.github.danieltex.sevendaysofcode

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.github.danieltex.sevendaysofcode.model.Movie


@Composable
@Preview
fun App() {
    MaterialTheme(
        colors = darkColors()
    ) {
        Surface(modifier = Modifier.fillMaxWidth()) {
            LazyColumn {
                items(movies()) {movie ->
                    MovieItem(movie)
                }
            }
        }
    }
}

private fun movies(): List<Movie> = listOf(
    Movie(
        title = "The Shawshank Redemption",
        image = "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,3,128,176_AL_.jpg",
        rating = "9.2",
        year = "1994"
    ),
    Movie(
        title = "The Godfather",
        image = "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,1,128,176_AL_.jpg",
        rating = "9.2",
        year = "1972"
    ),
    Movie(
        title = "The Dark Knight",
        image = "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UX128_CR0,3,128,176_AL_.jpg",
        rating = "9.0",
        year = "2008",
    ),
    Movie(
        title = "The Godfather: Part II",
        image = "https://m.media-amazon.com/images/M/MV5BMWMwMGQzZTItY2JlNC00OWZiLWIyMDctNDk2ZDQ2YjRjMWQ0XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,1,128,176_AL_.jpg",
        rating = "9.0",
        year = "1974"
    ),
    Movie(
        title = "12 Angry Men",
        image = "https://m.media-amazon.com/images/M/MV5BMWU4N2FjNzYtNTVkNC00NzQ0LTg0MjAtYTJlMjFhNGUxZDFmXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,3,128,176_AL_.jpg",
        rating = "8.9",
        year = "1957"
    )
)

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "IMDB",
        resizable = false
    ) {
        App()
    }
}
