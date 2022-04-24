package com.example.aplikasi_responsi_fintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //1. instance
        val btnRegisterRegister: Button = findViewById(R.id.btn_register_register)
        val btnPanahRegister: Button = findViewById(R.id.btn_panah_register)

        //event button
        btnRegisterRegister.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        btnPanahRegister.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

    }
}