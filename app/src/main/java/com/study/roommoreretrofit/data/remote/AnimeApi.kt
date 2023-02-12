package com.study.roommoreretrofit.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface AnimeApi {

    @GET("/api/v2/pokemon/")
    suspend fun fetchAnimeApiFromRemote(): Response<AnimeResponseWrapper<AnimeDto>>

}