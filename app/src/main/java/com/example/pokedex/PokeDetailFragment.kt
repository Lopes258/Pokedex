package com.example.pokedex

import android.os.Bundle
import android.view.InputDevice
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PokeDetailFragment {
}

class LevelFragment: Fragment(){

    private lateinit var levelView: View
    private lateinit var recyclerView: RecyclerView

    private val listLevel = arrayListOf(
        Skill("Skill1",45,100,"1"),
     Skill("Skill2",45,100,"1"),
     Skill("Skill3",45,100,"1"),
    Skill("Skill4",45,100,"1"),
    Skill("Skill5",45,100,"1"),
    Skill("Skill6",45,100,"1"),
    Skill("Skill7",45,100,"1"),

    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        levelView = inflater.inflate(R.layout.fragment_level, container, false)
        return levelView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView = levelView.findViewById(R.id.rv_Level)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = LevelAdapter(listLevel)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }
}

class EggFragment: Fragment() {

    private lateinit var eggView: View
    private lateinit var recyclerView: RecyclerView

    private val eggList = arrayListOf(
        Skill("Nome",45,100,"1"),
        Skill("Nome",45,100,"1"),Skill("Nome",45,100,"1"),
        Skill("Nome",45,100,"1"),
        Skill("Nome",45,100,"1"),
        Skill("Nome",45,100,"1"),Skill("Nome",45,100,"1"),
        Skill("Nome",45,100,"1"),
    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        eggView = inflater.inflate(R.layout.fragment_egg, container, false)
        return eggView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView = eggView.findViewById(R.id.rv_Egg)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = LevelAdapter(eggList)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }

}

class TMFragment: Fragment() {

    private lateinit var tmView: View
    private lateinit var recyclerView: RecyclerView

    private val tmList = arrayListOf(
        Skill("Nome",45,100,"1"),
        Skill("Nome",45,100,"1"),
        Skill("Nome",45,100,"1"),
        Skill("Nome",45,100,"1"),
        Skill("Nome",45,100,"1"),
        Skill("Nome",45,100,"1"),
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tmView = inflater.inflate(R.layout.fragment_tm, container, false)
        return tmView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView = tmView.findViewById(R.id.rv_TM)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = LevelAdapter(tmList)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }


}

