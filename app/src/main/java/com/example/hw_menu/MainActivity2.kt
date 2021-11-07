package com.example.hw_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent.extras?.getString("title")
        findViewById<TextView>(R.id.textView_Avtivity2).text = intent
    }
}