package com.example.hw_menu

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    var isSelected = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_item, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.file -> {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("title", item.title)
                startActivity(intent)
            }
            R.id.setting -> {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("title", item.title)
                startActivity(intent)
            }
            R.id.login -> {
                isSelected = false
            }
            R.id.logout -> isSelected = true

            else -> super.onOptionsItemSelected(item)
        }
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {

        if (isSelected) {
            menu?.findItem(R.id.login)?.isVisible = true
            menu?.findItem(R.id.logout)?.isVisible = false
        } else {
            menu?.findItem(R.id.login)?.isVisible = false
            menu?.findItem(R.id.logout)?.isVisible = true
        }
        return true
    }
}