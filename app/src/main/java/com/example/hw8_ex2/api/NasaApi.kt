package com.example.hw8_ex2.api

import retrofit2.http.GET
import retrofit2.http.Query
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import kotlin.random.Random

private const val API_KEY = "d2c42196ac80b5379f6687ac8c1f9505"

interface NasaApi {

    @GET("services/rest/")
    suspend fun fetchPhotos(
        @Query("method") method: String = "nasa.interestingness.getList",
        @Query("api_key") apiKey: String = API_KEY,
        @Query("format") format: String = "json",
        @Query("nojsoncallback") noJsonCallback: Int = 1,
        @Query("extras") extras: String = "url_s",
        @Query("date") date: String
    ): NasaResponse


    // @GET("/")
    // suspend fun fetchPhotos(date: String): FlickrResponse


    /* @GET(
         "services/rest/?method=flickr.interestingness.getList" +
                 "&api_key=$API_KEY" +
                 "&format=json" +
                 "&nojsoncallback=1" +
                 "&extras=url_s" +
                 "&date=date"
     )

     suspend fun fetchPhotos(date: String): FlickrResponse*/
    // suspend fun fetchContents(): String

}