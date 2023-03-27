package com.latihan_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById<ViewPager>(R.id.view_pager)
        var tabs = findViewById<TabLayout>(R.id.tab_layout_view)

        val adapter = AdapterFragment(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(FavoriteFragment(), "Favorit")
        adapter.addFragment(SettingFragment(), "Setting")

        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.baseline_favorite_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.baseline_settings_24)
    }


}