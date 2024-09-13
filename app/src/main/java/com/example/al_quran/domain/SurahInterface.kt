package com.example.al_quran.domain


import com.example.al_quran.models.ChaptersItem
import com.example.al_quran.models.ResponseSurahNames
import com.example.al_quran.models.ResponseSurahs
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface SurahInterface {

    @GET("chapters/")
    fun getSurahNames(
        @Header("Accept") h1: String = "application/json"
    ): Call<ResponseSurahNames>

    @GET("{no}")
    fun getSurahs(
        @Path("no") id: Int,
        @Header("https://al-quran1.p.rapidapi.com/") h2: String = "f9f3e683f4mshb35bfba33265e82p1c6800jsn636787f29add",
        @Header("x-rapidapi-host") h3: String = "al-quran1.p.rapidapi.com"

    ): Call<ResponseSurahs>
}