package com.koinandroid.home

import com.koinandroid.common.network.MoviesApi

class HomeRepo(private val api : MoviesApi) {

    private val apiKey = "af3bca2fef1c8dd8ceaa69f5e27ef822"

    suspend fun getPopularMovies() = api.getPopularMovies(apiKey)
}