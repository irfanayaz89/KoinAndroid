package com.koinandroid.common.network

import com.koinandroid.movies.models.Movie
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {

    fun getMoviesApi(retrofit: Retrofit) : MoviesApi {

        return retrofit.create(MoviesApi::class.java)
    }

    single { getMoviesApi(get()) }
}