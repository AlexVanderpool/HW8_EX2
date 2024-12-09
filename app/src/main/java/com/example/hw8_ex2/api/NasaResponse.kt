package com.example.hw8_ex2.api

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class NasaResponse(
    val photos: PhotoResponse
)