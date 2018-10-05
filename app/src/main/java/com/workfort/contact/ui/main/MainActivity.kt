package com.workfort.contact.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.workfort.contact.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val host: NavHostFragment = supportFragmentManager
                .findFragmentById(R.id.nav_host_fragment) as NavHostFragment? ?: return

        val navController = host.navController

        navController.addOnNavigatedListener { _, destination ->
            val dest = destination.label
            Toast.makeText(this@MainActivity, "Navigated to $dest", Toast.LENGTH_SHORT).show()
            checkFragment(dest.toString())
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return NavigationUI.onNavDestinationSelected(item, Navigation.findNavController(this, R.id.nav_host_fragment))
                || super.onOptionsItemSelected(item)
    }


    private fun checkFragment(label : String) {
        if (label.equals("Home")) {
            supportActionBar?.setDisplayHomeAsUpEnabled(false)
            supportActionBar?.title = "Home"
        } else {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "Add Contact"
        }
    }
}
