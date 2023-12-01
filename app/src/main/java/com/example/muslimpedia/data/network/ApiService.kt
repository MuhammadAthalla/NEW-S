package com.example.muslimpedia.data.network

import com.example.muslimpedia.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/v2/everything")
    fun getCommonMuslimNews(
        @Query("q") q:String = "World",
        @Query("language") language:String = "en",
    ): Call<NewsResponse>

    @GET("/v2/everything")
    fun getAlQuranNews(
        @Query("q") q: String = "Work",
        @Query("language") language: String = "en"
    ): Call<NewsResponse>


    @GET("/v2/everything")
    fun getAlJazeeraNews(
        @Query("q") q: String = "Sports",
        @Query("language") language: String = "en"
    ): Call<NewsResponse>


    @GET("/v2/everything")
    fun getWarningForMuslimNews(
        @Query("q") q: String = "Technology",
        @Query("language") language: String = "en"
    ): Call<NewsResponse>


    @GET("/v2/everything")
    fun getSearchNews(
        @Query("q") q: String,
        @Query("pageSize") pageSize: Int = 19,
    ): Call<NewsResponse>

}