package com.example.lemonadeapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView:ImageView = findViewById(R.id.imageView)
        imageView.setOnClickListener {
            Select()
        }
    }

    fun Select(){
        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.lemon)
        imageView.setOnClickListener {
            Squeze()
        }
    }

    fun Squeze(){
        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.lemon_juice)
        imageView.setOnClickListener {
            Drink()
        }
    }

    fun Drink(){
        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.jar)
        imageView.setOnClickListener {
            Restart()
        }
    }

    fun Restart(){
        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.lemon_tree)
        imageView.setOnClickListener {
            Select()
        }
    }
}
