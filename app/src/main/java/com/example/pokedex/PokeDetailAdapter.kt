package com.example.pokedex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView

class PokeDetailAdapter {

}

//Adapter para o fragment_egg

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

//Adapter para o fragment_level

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

//Adapter para o fragment_TM

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

//Adapter para o tablayout

class SkillPagerAdapter(
    private val fragments: List<Fragment>,

    manager: FragmentManager,

    private val titles: List<String>
) : FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount()= fragments.size

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getPageTitle(position: Int) = titles[position]

}