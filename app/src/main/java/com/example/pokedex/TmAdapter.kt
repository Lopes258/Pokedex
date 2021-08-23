package com.example.pokedex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.Skill
import com.example.pokedex.TmViewHolder

class TmAdapter (
    private val listLevel: List<Skill>
) : RecyclerView.Adapter<TmViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  TmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_level, parent, false )
        return TmViewHolder(view)
    }
    override fun getItemCount() = listLevel.size

    override fun onBindViewHolder(holder: TmViewHolder, position: Int) = holder.bind(listLevel[position])


}