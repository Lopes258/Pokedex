package com.example.pokedex

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.Skill


class EggViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private var nameEgg = itemView.findViewById<TextView>(R.id.nameLevel)
    private var accEgg = itemView.findViewById<TextView>(R.id.accLevel)
    private var powerEgg = itemView.findViewById<TextView>(R.id.powerLevel)
    private var lvlEgg = itemView.findViewById<TextView>(R.id.lvlLevel)

    fun bind(level: Skill){
        nameEgg.text = level.name
        accEgg.text = level.acc.toString()
        powerEgg.text = level.power.toString()
        lvlEgg.text = level.lvl

    }
}
