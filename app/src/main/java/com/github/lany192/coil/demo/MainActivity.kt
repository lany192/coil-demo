package com.github.lany192.coil.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.github.lany192.coil.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.image.load(MockUtils.getImageUrl())
        binding.image2.load(MockUtils.getImageUrl())
    }
}