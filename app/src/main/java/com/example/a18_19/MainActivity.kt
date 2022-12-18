package com.example.a18_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    private lateinit var conf: AppBarConfiguration
    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.ab.toolbar)
        navController = findNavController(R.id.fragmentContainerView)
        conf = AppBarConfiguration(
            setOf(
                R.id.item1,
                R.id.item2,
                R.id.item3,
                R.id.item4,
                R.id.item5,
            ), binding.drawer

        )
        setupActionBarWithNavController(navController,conf)
        binding.navView.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(conf) || super.onSupportNavigateUp()
}
}