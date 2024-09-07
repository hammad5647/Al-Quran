package com.example.al_quran.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.al_quran.R
import com.example.al_quran.databinding.VersesSampleBinding

import com.example.al_quran.models.SurahListModel

class SurahAdapter(private var list: MutableList<SurahListModel>) :
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
        return list.size
    }

    override fun onBindViewHolder(holder: SurahViewHolder, position: Int) {

        holder.binding.surahNumber.text = list[position].toString()
        holder.binding.arabicName.text = list[position].toString()
        holder.binding.surahName.text = list[position].toString()
        holder.binding.totalVerse.text = list[position].toString()

    }

}