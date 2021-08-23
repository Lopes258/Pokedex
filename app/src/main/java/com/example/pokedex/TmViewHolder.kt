package com.example.pokedex

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.Skill


class TmViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private var nameTM = itemView.findViewById<TextView>(R.id.nameLevel)
    private var accTM = itemView.findViewById<TextView>(R.id.accLevel)
    private var powerTM = itemView.findViewById<TextView>(R.id.powerLevel)
    private var lvlTM = itemView.findViewById<TextView>(R.id.lvlLevel)

    fun bind(level: Skill){
        nameTM.text = level.name
        accTM.text = level.acc.toString()
        powerTM.text = level.power.toString()
        lvlTM.text = level.lvl

    }
}
