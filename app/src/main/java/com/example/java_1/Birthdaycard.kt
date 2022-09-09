package com.example.java_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent

class Birthdaycard : AppCompatActivity() {

    companion object{
        const val Name_extra= "name_extra"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaycard)

        val name= intent.getStringExtra(Name_extra)
        val textView = findViewById<TextView>(R.id.textView2).apply {
            text = "happy birthday \n $name"
        }
    }
}