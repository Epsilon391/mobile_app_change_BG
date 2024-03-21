package com.example.randomnumbergenerator

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.randomnumbergenerator.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.rollBtn.setOnClickListener {
            changeBG()
        }
    }

    private fun changeBG() {
        val colorVals = arrayOf(Random.nextInt(256),Random.nextInt(256),Random.nextInt(256))
        val color = Color.argb(255, colorVals[0], colorVals[1], colorVals[2])
        binding.base.setBackgroundColor(color)
    }
}