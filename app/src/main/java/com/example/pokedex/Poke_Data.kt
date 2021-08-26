package com.example.pokedex

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pokedex.databinding.FragmentPokemonDetailBinding
import com.google.android.material.tabs.TabLayout


class Poke_Data : Fragment() {

    private var binding: FragmentPokemonDetailBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentPokemonDetailBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentList = listOf(LevelFragment(), TMFragment(), EggFragment())
        val fragmentTileList = listOf("Level","Skill","Egg")

        binding?.tbPoke?.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Log.i("tab selected", tab?.text.toString())
                when(tab?.position){

                    }
                }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }


        })


    }



    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}