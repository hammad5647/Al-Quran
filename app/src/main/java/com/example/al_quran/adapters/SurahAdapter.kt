package com.example.al_quran.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.al_quran.R
import com.example.al_quran.activities.SurahActivity
import com.example.al_quran.databinding.VersesSampleBinding
import com.example.al_quran.models.ChaptersItem

class SurahAdapter(private var list: List<ChaptersItem?>?) :
    RecyclerView.Adapter<SurahAdapter.SurahViewHolder>() {

    class SurahViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding = VersesSampleBinding.bind(itemView)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SurahViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.verses_sample, parent, false)
        return SurahViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list!!.size
    }

    override fun onBindViewHolder(holder: SurahViewHolder, position: Int) {
        holder.binding.surahNumber.text = list?.get(position)!!.id.toString()
        holder.binding.arabicName.text = list?.get(position)!!.nameArabic.toString()
        holder.binding.surahName.text = list?.get(position)!!.nameSimple.toString()
        holder.binding.totalVerse.text = list?.get(position)!!.versesCount.toString()

        holder.binding.versesSample.setOnClickListener {
            var id = list!![position]!!.id.toString()
            var intent = Intent(holder.itemView.context,SurahActivity::class.java)

        }

    }

}