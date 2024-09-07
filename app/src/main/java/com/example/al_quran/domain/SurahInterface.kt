package com.example.al_quran.domain


import com.example.al_quran.models.ResponseSurahs
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface SurahInterface {

    @GET("chapters/{no}")
    fun getSurah(
        @Path("no") id: String,
        @Header("Accept") h1: String = "application/json"
    ): Call<ResponseSurahs>
}