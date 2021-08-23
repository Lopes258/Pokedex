package com.example.pokedex

import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.Skill

class LevelFragment: Fragment(){

    private lateinit var levelView: View
    private lateinit var recyclerView: RecyclerView

    private val listLevel = arrayListOf(
        Skill("Nome",45,100,"1")
    )

}
