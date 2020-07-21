package com.example.tmdb_dagger2.model

data class SimilarInfo(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)
