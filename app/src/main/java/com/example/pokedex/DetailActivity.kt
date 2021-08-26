package com.example.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout




class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.poke_fragment)

        val levelFragment = LevelFragment()
        val eggFragment = EggFragment()
        val tmFragment = TMFragment()


        val tabLayout = findViewById<TabLayout>(R.id.tb_Poke)
        val viewPager = findViewById<ViewPager>(R.id.vw_Poke)

        tabLayout.setupWithViewPager(viewPager)

        val fragments = listOf(levelFragment, tmFragment, eggFragment)
        val titles = listOf("Level", "TM", "Egg")

        viewPager.adapter = SkillPagerAdapter(fragments , supportFragmentManager, titles )

    }

}
