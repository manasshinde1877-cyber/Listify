package com.example.mnstodo_list

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide


class exaggeration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.exaggeration)

        val imageView = findViewById<ImageView>(R.id.gifExaggeration)

        Glide.with(this)
            .asGif()
            .load(R.drawable.exaggeration)
            .into(imageView)

    val getStartedButton = findViewById<Button>(R.id.button2)

        getStartedButton.setOnClickListener {
            var intent3 = Intent(this, tasks::class.java)
            startActivity(intent3)
        }
    }
}