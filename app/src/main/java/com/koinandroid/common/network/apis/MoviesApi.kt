package com.koinandroid.common.network

import com.koinandroid.movies.models.MovieResponse
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApi {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String) : Response<MovieResponse>
}