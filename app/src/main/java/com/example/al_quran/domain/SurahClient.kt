package com.example.al_quran.domain

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SurahClient {
    companion object {

        private const val SURAHNAMES = "https://api.quran.com/api/v4/"
        private const val FULLSURAHS = "https://al-quran1.p.rapidapi.com/"
        private var retrofit: Retrofit? = null

        fun retroSurahNames(): Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder().baseUrl(SURAHNAMES)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }

        fun retroSurahs(): Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder().baseUrl(FULLSURAHS)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
    }
}