package com.example.tmdb_dagger2.model.data

data class NowPlayItem(
    val id : Int,
    val adult: Boolean,
    val backdrop_path: String?,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val poster_path: String?,
    val release_date: String,
    val title: String
)