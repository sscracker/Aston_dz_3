package com.bignerdbranch.android.aston_dz_3

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdbranch.android.aston_dz_3.databinding.ActivityLoadImageBinding
import com.squareup.picasso.Picasso
import java.net.URL

class LoadImage : AppCompatActivity() {
    private lateinit var binding: ActivityLoadImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoadImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loadImageButton.setOnClickListener {
            load(binding.urlEditText.text.toString())
        }

    }

    private fun load(url: String){
        Picasso.with(this)
            .load(url)
            .into(binding.loadImageImageVIew)
    }
}