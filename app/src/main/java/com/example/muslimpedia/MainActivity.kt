package com.example.muslimpedia

import android.app.SearchManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.SearchView
import androidx.core.content.ContextCompat
import com.example.muslimpedia.adapter.SectionPagerAdapter
import com.example.muslimpedia.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        setUpViewPager()
    }

    private fun setUpViewPager() {
        binding.vpNews.adapter = SectionPagerAdapter(this)
        val tabList = arrayOf(
            "Business",
            "Nature",
            "Sports",
            "Politic"
        )

        // Ganti SectionPagerAdapter dengan nama adapter yang sesuai
        val adapter = SectionPagerAdapter(this)
        binding.vpNews.adapter = adapter

        TabLayoutMediator(binding.tabs, binding.vpNews) { tab, position ->
            // Gantilah "R.drawable.ic_education", "R.drawable.ic_nature", dll.
            // dengan referensi gambar yang sesuai untuk setiap tab.
            when (position) {
                0 -> tab.icon = ContextCompat.getDrawable(this, R.drawable.iconparkworld)
                1 -> tab.icon = ContextCompat.getDrawable(this, R.drawable.ic_sharphomework)
                2 -> tab.icon = ContextCompat.getDrawable(this, R.drawable.iconoir_gym)
                3 -> tab.icon = ContextCompat.getDrawable(this, R.drawable.grommeticons_technology)
                // Tambahkan lebih banyak case sesuai dengan jumlah tab yang Anda miliki
            }
        }.attach()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)

        val SearchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        (menu?.findItem(R.id.menu_search)?.actionView as androidx.appcompat.widget.SearchView).apply{
            setSearchableInfo(SearchManager.getSearchableInfo(componentName))

            return true
        }
    }
}