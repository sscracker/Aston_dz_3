package com.bignerdbranch.android.aston_dz_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdbranch.android.aston_dz_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextTaskButton.setOnClickListener{
            val intent = Intent(this@MainActivity,LoadImage::class.java)
            startActivity(intent)
        }


    }
}