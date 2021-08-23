package com.example.pokedex

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PokeDetailViewHolder {
}
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
