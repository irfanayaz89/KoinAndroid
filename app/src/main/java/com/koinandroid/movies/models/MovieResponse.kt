package com.koinandroid.movies.models

import com.google.gson.annotations.SerializedName

data class MovieResponse (

    @SerializedName("page") var page: Double = 0.0,
    @SerializedName("total_results") var totalResults : Double = 0.0,
    @SerializedName("total_pages") var totalPages : Double = 0.0,
    @SerializedName("results") var results : List<Movie>? = null

)