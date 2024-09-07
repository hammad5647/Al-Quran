package com.example.al_quran

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.al_quran.adapters.SurahAdapter
import com.example.al_quran.databinding.ActivityMainBinding
import com.example.al_quran.domain.SurahClient.Companion.retrofit
import com.example.al_quran.domain.SurahInterface
import com.example.al_quran.models.ResponseSurahs
import com.example.al_quran.models.SurahListModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    private var adapter: SurahAdapter? = null
    private lateinit var binding: ActivityMainBinding
    private lateinit var surahList: MutableList<SurahListModel>
    lateinit var list: ResponseSurahs


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        surahList = mutableListOf<SurahListModel>()
        binding = ActivityMainBinding.inflate(layoutInflater)


        enableEdgeToEdge()
        setContentView(binding.root)


        retrofit().create(SurahInterface::class.java).getSurah(id = "114")
            .enqueue(object : Callback<ResponseSurahs> {
                override fun onResponse(
                    call: Call<ResponseSurahs>, response: Response<ResponseSurahs>
                ) {
                    if (response.isSuccessful) {

                        Log.d("Success", "onResponse: ${response.body()}")
                        val simpleName = response.body()!!.chapter?.nameSimple.toString()
                        val arabicName = response.body()!!.chapter?.nameArabic.toString()
                        val verse = response.body()!!.chapter?.versesCount

                        val surahModel = SurahListModel(
                            simpleName = simpleName,
                            verse = verse,
                            arabicName = arabicName
                        )
                        surahList.add(surahModel)

                    }
                }

                override fun onFailure(call: Call<ResponseSurahs>, t: Throwable) {
                    Log.e("Error", "onFailure: $t")
                }

            })
        adapter = SurahAdapter(surahList)
        binding.recyclerViewHome.adapter = adapter
    }

    fun surahNames() {
        var surahNames = arrayOf({
            "ٱلْفَاتِحَة";"ٱلْبَقَرَة";"آلِ عِمْرَان";"ٱلنِّسَاء";"ٱلْمَائِدَة";"ٱلْأَنْعَام";"ٱلْأَعْرَاف";"ٱلْأَنْفَال";"ٱلتَّوْبَة";"يُونُس";
            "هُود";"يُوسُف";"ٱلرَّعْد";"إِبْرَاهِيم";"ٱلْحِجْر";"ٱلنَّحْل";"الإسراء";"ٱلْكَهْف";"مَرْيَم";"طه";"ٱلْأَنْبِيَاء";"ٱلْحَجّ";
            "ٱلْمُؤْمِنُون";"ٱلنُّور";"ٱلْفُرْقَان";"ٱلشُّعَرَاء";"ٱلنَّمْل";"ٱلْقَصَص";"ٱلْعَنْكَبُوت";"ٱلرُّوم";"لُقْمَان";"ٱلسَّجْدَة";
            "ٱلْأَحْزَاب";"سَبَأ";"فَاطِر";"يس";"ٱلصَّافَّات";"ص";"ٱلزُّمَر";"غَافِر";"فُصِّلَت";"ٱلشُّورىٰ";"ٱلْزُّخْرُف";"ٱلدُّخَان";
            "ٱلْجَاثِيَة";"ٱلْأَحْقَاف";"مُحَمَّد";"ٱلْفَتْح";"ٱلْحُجُرَات";"ق";"ٱلذَّارِيَات";"ٱلطُّور";"ٱلنَّجْم";"ٱلْقَمَر";"ٱلرَّحْمَٰن";
            "ٱلْوَاقِعَة";"ٱلْحَدِيد";"ٱلْمُجَادِلَة";"ٱلْحَشْر";"ٱلْمُمْتَحَنَة";"ٱلصَّفّ";"ٱلْجُمُعَة";"ٱلْمُنَافِقُون";"ٱلتَّغَابُن";"ٱلطَّلَاق";
            "ٱلتَّحْرِيم";"ٱلْمُلْك";"ٱلْقَلَم";"ٱلْحَاقَّة";"ٱلْمَعَارِج";"نُوح";"ٱلْجِنّ";"ٱلْمُزَّمِّل";"ٱلْمُدَّثِّر";"ٱلْقِيَامَة";"ٱلْإِنْسَان";
            "ٱلْمُرْسَلَات";"ٱلنَّبَأ";"ٱلنَّازِعَات";"عَبَسَ";"ٱلتَّكْوِير";"ٱلْإِنْفِطَار";"ٱلْمُطَفِّفِين";"ٱلْإِنْشِقَاق";"ٱلْبُرُوج";"ٱلطَّارِق";
            "ٱلْأَعْلَىٰ";"ٱلْغَاشِيَة";"ٱلْفَجْر";"ٱلْبَلَد";"ٱلشَّمْس";"ٱللَّيْل";"ٱلضُّحَىٰ";"ٱلشَّرْح";"ٱلتِّين";"ٱلْعَلَق";"ٱلْقَدْر";
            "ٱلْبَيِّنَة";"ٱلزَّلْزَلَة";"ٱلْعَادِيَات";"ٱلْقَارِعَة";"ٱلتَّكَاثُر";"ٱلْعَصْر";"ٱلْهُمَزَة";"ٱلْفِيل";"قُرَيْش";"ٱلْمَاعُون";
            "ٱلْكَوْثَر";"ٱلْكَافِرُون";"ٱلنَّصْر";"ٱلْمَسَد";"ٱلْإِخْلَاص";"ٱلْفَلَق";"ٱلنَّاس"
        })
    }
}