package com.example.mnstodo_list

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)

        var proceed = findViewById<Button>(R.id.button)
        var name = findViewById<EditText>(R.id.editTextText).text.toString()
        var age = findViewById<EditText>(R.id.editTextText01).text.toString()
        var error = findViewById<TextView>(R.id.textView7)



        proceed.setOnClickListener {
            name = findViewById<EditText>(R.id.editTextText).text.toString()
            age = findViewById<EditText>(R.id.editTextText01).text.toString()
            age = findViewById<EditText>(R.id.editTextText01).text.toString()
            var intent2 = Intent(this, exaggeration::class.java)
            if(name.isEmpty()){
                error.text="Name is Mandatory"
            }
            else if(age.isEmpty()){
                error.text="Age is mandatory"
            }
                else if(!age.isDigitsOnly()){
                error.text="Age must be a Number"
                }

                else{startActivity(intent2)}

        }

    }
}