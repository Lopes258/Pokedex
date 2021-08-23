package com.example.pokedex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.EggViewHolder
import com.example.pokedex.R
import com.example.pokedex.Skill


class EggAdapter (
    private val listLevel: List<Skill>

    ) : RecyclerView.Adapter<EggViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EggViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_egg, parent, false )
            return EggViewHolder(view)
        }
        override fun getItemCount() = listLevel.size

        override fun onBindViewHolder(holder: EggViewHolder, position: Int) = holder.bind(listLevel[position])


    }
