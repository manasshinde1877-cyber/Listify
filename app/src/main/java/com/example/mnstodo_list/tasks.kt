package com.example.mnstodo_list

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tasks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.tasks)
        var checkedCounter = 0

        var counterText = findViewById<TextView>(R.id.CheckedCounter)
        var mmessage = findViewById<TextView>(R.id.textView11)
        var checkBox1 = findViewById<CheckBox>(R.id.checkBox)
        var checkBox2 = findViewById<CheckBox>(R.id.checkBox1)
        var checkBox3 = findViewById<CheckBox>(R.id.checkBox2)
        var checkBox4 = findViewById<CheckBox>(R.id.checkBox4)
        var checkBox5 = findViewById<CheckBox>(R.id.checkBox5)

        val checkBoxes = listOf(checkBox1, checkBox2, checkBox3, checkBox4, checkBox5)

        checkBoxes.forEach { cb ->
            cb.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) checkedCounter++ else checkedCounter--
                counterText.text = "$checkedCounter"
                if (checkedCounter == 0) {
                    mmessage.text="Lets start with the first task 🔥"
                }
                else if (checkedCounter == 1) {
                    mmessage.text="That's the start ⚡⚡⚡"
                }
                else if (checkedCounter == 2) {
                    mmessage.text="Way to gooo 🔥🔥🔥"
                }
                else if (checkedCounter == 3) {
                    mmessage.text="Woohoo ✨✨ just two more"
                }
                else if (checkedCounter == 4) {
                    mmessage.text="CLOSEEEE 🤩🤩 Just one"
                }
                else{
                    mmessage.text="LETS GOOOOOO ⚡🔥✨"
                }
            }



        }
    }

}
