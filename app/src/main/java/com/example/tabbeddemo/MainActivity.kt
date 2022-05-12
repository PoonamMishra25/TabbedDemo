package com.example.tabbeddemo

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity

import com.example.tabbeddemo.ui.main.SectionsPagerAdapter
import com.example.tabbeddemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs

        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = binding.fab

        tabs.getTabAt(0)?.icon=getDrawable(R.drawable.call)
        tabs.getTabAt(1)?.icon=getDrawable(R.drawable.favorite)
        tabs.getTabAt(2)?.icon=getDrawable(R.drawable.history)
       //tabs.setTabIconTintResource(R.color.red)
//        tabs.tabTextColors=
//// new newnewnewn

//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
    }
}