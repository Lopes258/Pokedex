package com.example.pokedex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.LevelViewHolder
import com.example.pokedex.R
import com.example.pokedex.Skill

 class LevelAdapter (
    private val listLevel: List<Skill>
        ) : RecyclerView.Adapter<LevelViewHolder>() {

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.item_level, parent, false )
         return LevelViewHolder(view)
     }
     override fun getItemCount() = listLevel.size

     override fun onBindViewHolder(holder: LevelViewHolder, position: Int) = holder.bind(listLevel[position])


}