package com.example.fetch_image_app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import com.example.fetch_image_app.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var imageView  = binding.image
        binding.clearBtn.setOnClickListener {
            binding.editTxt.setText("")
            imageView.setImageDrawable(null)
        }

        binding.fetchBtn.setOnClickListener {
            Picasso.get().load("${binding.editTxt.text}").fit().centerCrop().into(imageView)
        }
    }
}