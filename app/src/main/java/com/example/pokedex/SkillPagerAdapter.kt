package com.example.pokedex

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class SkillPagerAdapter(
    private val fragments: List<Fragment>,

    manager: FragmentManager,

    private val titles: List<String>
    ) : FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount()= fragments.size

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getPageTitle(position: Int) = titles[position]

}