package com.example.aplikasi_responsi_fintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //1. instance
        val btnRegisterLogin: Button = findViewById(R.id.btn_register_login)
        val btnHereLogin: Button = findViewById(R.id.btn_here_login)
        val btnPanahLogin: Button = findViewById(R.id.btn_panah_login)

        //event button
        btnRegisterLogin.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnHereLogin.setOnClickListener {
            val intent = Intent(this,RecoveryActivity::class.java)
            startActivity(intent)
        }

        btnPanahLogin.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}