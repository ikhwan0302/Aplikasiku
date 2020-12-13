package com.aplikasiku.app.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.aplikasiku.app.R
import com.aplikasiku.app.databinding.ActivityMainBinding
import com.aplikasiku.app.ui.auth.AplikasikuApp
import com.aplikasiku.app.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            AplikasikuApp.logout(this){
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}