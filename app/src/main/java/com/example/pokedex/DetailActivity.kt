package com.example.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.pokedex.R
import com.example.pokedex.SkillPagerAdapter
import com.example.pokedex.databinding.PokeFragmentBinding
import com.example.pokedex.TMFragment
import com.google.android.material.tabs.TabLayout
import com.example.pokedex.LevelFragment
import androidx.fragment.app.Fragment
import com.example.pokedex.EggFragment


class DetailActivity : AppCompatActivity() {
    private lateinit var binding: PokeFragmentBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PokeFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.poke_fragment)

        val levelFragment = LevelFragment()
        val eggFragment = EggFragment()
        val tmFragment = TMFragment()


        val tabLayout = findViewById<TabLayout>(R.id.tb_Poke)
        val viewPager = findViewById<ViewPager>(R.id.vw_Poke)

        tabLayout.setupWithViewPager(viewPager)

        val fragments = listOf(levelFragment, eggFragment, tmFragment)
        val titles = listOf("Level", "TM", "Egg")

        viewPager.adapter = SkillPagerAdapter(fragments as List<Fragment>, supportFragmentManager, titles )

    }

}
