package com.example.pokedex

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.Skill


class LevelViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private var nameLevel = itemView.findViewById<TextView>(R.id.nameLevel)
    private var accLevel = itemView.findViewById<TextView>(R.id.accLevel)
    private var powerLevel = itemView.findViewById<TextView>(R.id.powerLevel)
    private var lvlLevel = itemView.findViewById<TextView>(R.id.lvlLevel)

    fun bind(level: Skill){
        nameLevel.text = level.name
        accLevel.text = level.acc.toString()
        powerLevel.text = level.power.toString()
        lvlLevel.text = level.lvl

    }
}
