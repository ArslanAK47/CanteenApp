package com.example.canteenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonAdmin = findViewById<Button>(R.id.Adminbt)
        ButtonAdmin.setOnClickListener {
            val intent = Intent(this, LoginRealAdmin::class.java)
            startActivity(intent)
        }
    }
}
