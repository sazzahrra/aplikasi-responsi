package com.example.aplikasi_responsi_fintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasi_responsi_fintech.history.HistoryFragment
import com.example.aplikasi_responsi_fintech.home.HomeFragment
import com.example.aplikasi_responsi_fintech.payment.PaymentFragment
import com.example.aplikasi_responsi_fintech.setting.SettingFragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //1. instance
        val btnHomeHome: Button = findViewById(R.id.btn_home_home)
        val btnHistoryHome: Button = findViewById(R.id.btn_history_home)
        val btnPaymentHome: Button = findViewById(R.id.btn_payment_home)
        val btnSettingHome: Button = findViewById(R.id.btn_setting_home)

        //event button
        btnHomeHome.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        btnHistoryHome.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        btnPaymentHome.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        btnSettingHome.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

//        // fragment
//        btnHomeHome.setOnClickListener {
//            loadFragment(HomeFragment())
//        }

//        btnHistoryHome.setOnClickListener {
//            loadFragment(HistoryFragment())
//        }
//
//        btnPaymentHome.setOnClickListener {
//            loadFragment(PaymentFragment())
//        }
//
//        btnSettingHome.setOnClickListener {
//            loadFragment(SettingFragment())
//        }


    }
//
//    private fun loadFragment(fragment: Fragment){
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.container, fragment)
//            .commitNow()
//    }
}