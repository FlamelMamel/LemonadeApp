package com.example.lemonadeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Restart()
    }

    fun Select(){
        val imageView: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textView)
        textView.setText("Выдавите лимон")
        imageView.setImageResource(R.drawable.lemon)
        imageView.setOnClickListener {
            Squeze()
        }
    }

    fun Squeze(){
        val imageView: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textView)
        textView.setText("Выпейте лимонный сок")
        imageView.setImageResource(R.drawable.lemon_juice)
        imageView.setOnClickListener {
            Drink()
        }
    }

    fun Drink(){
        val imageView: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textView)
        textView.setText("Начните заново")
        imageView.setImageResource(R.drawable.jar)
        imageView.setOnClickListener {
            Restart()
        }
    }

    fun Restart(){
        val imageView: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textView)
        textView.setText("Выберите лимон")
        imageView.setImageResource(R.drawable.lemon_tree)
        imageView.setOnClickListener {
            Select()
        }
    }
}
