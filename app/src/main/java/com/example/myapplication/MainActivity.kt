package com.example.myapplication

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var licznik=1
        val visi= arrayListOf(View.VISIBLE,View.INVISIBLE)
        findViewById<Button>(R.id.but).setOnClickListener {
            if(findViewById<EditText>(R.id.log).text.toString()=="login" && findViewById<EditText>(R.id.pass).text.toString() == "haslo")
            {licznik++
            findViewById<TextView>(R.id.textView).visibility= visi[licznik%2]}
        }
    }
}