package com.mahmutalperenunal.moviesearch.model

import com.google.gson.annotations.SerializedName

data class MovieData (
    @SerializedName("Title") val title: String,
    @SerializedName("Year") val releaseDate: String,
    @SerializedName("Poster") val poster: String? = null,
    @SerializedName("imdbID") val imdbID: String
)