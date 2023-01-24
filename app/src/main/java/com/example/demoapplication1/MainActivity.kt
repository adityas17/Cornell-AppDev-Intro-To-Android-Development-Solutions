package com.example.demoapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview: TextView = findViewById(R.id.textview1)
        val edittext: EditText = findViewById(R.id.EditText)
        val button: Button = findViewById(R.id.Button)
        val imageview: ImageView = findViewById(R.id.image)
        button.setOnClickListener(){
            if(!edittext.text.isEmpty()){
                textview.text = edittext.text
            }
        }
    }
}