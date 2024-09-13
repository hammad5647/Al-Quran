package com.example.al_quran

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.al_quran.adapters.SurahAdapter
import com.example.al_quran.databinding.ActivityMainBinding
import com.example.al_quran.domain.SurahClient.Companion.retroSurahNames
import com.example.al_quran.domain.SurahInterface
import com.example.al_quran.models.ChaptersItem
import com.example.al_quran.models.ResponseSurahNames
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var adapter: SurahAdapter? = null
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        retroSurahNames().create(SurahInterface::class.java).getSurahNames()
            .enqueue(object : Callback<ResponseSurahNames> {
                override fun onResponse(
                    call: Call<ResponseSurahNames>, response: Response<ResponseSurahNames>
                ) {
                    if (response.isSuccessful) {
                        Log.d("Success", "onResponse: ${response.body()}")
                        adapter = SurahAdapter(response.body()!!.chapters)
                        binding.recyclerViewHome.adapter = adapter
                    }
                }

                override fun onFailure(call: Call<ResponseSurahNames>, t: Throwable) {
                    Log.e("Error", "onFailure: $t")
                }
            })
    }
}


