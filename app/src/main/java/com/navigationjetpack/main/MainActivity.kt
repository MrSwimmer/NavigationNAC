package com.androidnavigation.main

import android.app.Fragment
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.util.Log
import android.view.MenuItem
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.androidnavigation.main.fragment.*
import com.navigationjetpack.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.nav_header.view.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {

    lateinit var drawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupDrawerContent()
        setSupportActionBar(toolbar)
        drawerToggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close)
        drawerLayout.addDrawerListener(drawerToggle)
        val header = navView.getHeaderView(0)
        header.shareButton.setOnClickListener({})
    }

    private fun setupDrawerContent() {
        navView.setCheckedItem(0)
        navView.setNavigationItemSelectedListener { menuItem ->
            val navController = Navigation.findNavController(this, R.id.main_host_fragment)
            when (menuItem.itemId) {
                R.id.nav_news -> navController.navigate(R.id.newsFragment)
                R.id.nav_settings -> navController.navigate(R.id.settingsFragment)
                else -> navController.navigate(R.id.newsFragment)
            }
            menuItem.isChecked = true
            title = menuItem.title
            drawerLayout.closeDrawers()
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return if (drawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        drawerToggle.onConfigurationChanged(newConfig)
    }
}
