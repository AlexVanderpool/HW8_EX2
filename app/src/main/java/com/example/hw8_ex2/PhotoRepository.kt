package com.example.hw8_ex2

import com.example.hw8_ex2.api.NasaApi
import com.example.hw8_ex2.api.GalleryItem
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.Body
import retrofit2.http.Field
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import kotlin.random.Random

class PhotoRepository() {

    private val nasaApi: NasaApi


    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.nasa.gov/")
            //.addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        nasaApi = retrofit.create()
    }

    suspend fun fetchPhotos(date: String): List<GalleryItem> =
        nasaApi.fetchPhotos(date = date).photos.galleryItems


}