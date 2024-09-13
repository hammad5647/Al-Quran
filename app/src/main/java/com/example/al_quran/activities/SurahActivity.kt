package com.example.al_quran.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.al_quran.R
import com.example.al_quran.databinding.ActivitySurahBinding

class SurahActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySurahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySurahBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}