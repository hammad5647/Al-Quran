package com.example.al_quran.domain

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SurahClient {
    companion object {

        private const val URL = "https://api.quran.com/api/v4/"
        var retrofit: Retrofit? = null

        fun retrofit(): Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder().baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
    }
}