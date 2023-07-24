package com.example.wink

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val imageView = findViewById<ImageView>(R.id.imageView)
        Glide.with(this).load(R.raw.splash).into(imageView)

        Handler().postDelayed({
            val intent = Intent(this@Splash, Register::class.java)
            startActivity(intent)
            finish()
        }, 1700)

    }
}
