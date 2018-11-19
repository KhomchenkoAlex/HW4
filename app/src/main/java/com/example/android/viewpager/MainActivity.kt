package com.example.android.viewpager

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.example.android.viewpager.adapter.ViewPagerAdapter
import com.example.android.viewpager.fragment.DayFragment
import com.example.android.viewpager.fragment.MonthFragment
import com.example.android.viewpager.fragment.SignFragment

class MainActivity : AppCompatActivity() {
    private val fragments = mutableListOf(DayFragment() to "Days",
            MonthFragment() to "Months",
            SignFragment() to "Signs")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById<ViewPager>(R.id.pager)
        val adapter = ViewPagerAdapter(supportFragmentManager)

        fragments.forEach { fragment -> adapter.addFragment(fragment.first, fragment.second) }

        viewPager.adapter = adapter
        val tabLayout = findViewById<TabLayout>(R.id.tabs)
        tabLayout.setupWithViewPager(viewPager)
        println(tabLayout.tabCount)
    }
}
