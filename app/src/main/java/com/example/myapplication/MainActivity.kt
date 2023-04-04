package com.example.myapplication

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var licznik = 1
        val visi = arrayListOf(View.VISIBLE, View.INVISIBLE)
        findViewById<Button>(R.id.but).setOnClickListener {
            if (findViewById<EditText>(R.id.log).text.toString() == "login" && findViewById<EditText>(
                    R.id.pass
                ).text.toString() == "haslo"
            ) {
                licznik++
            }

        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.more -> finish()
            R.id.more2 -> startActivity(Intent(this, daneB::class.java))
            R.id.more3 -> startActivity(Intent(this, dziennikB::class.java))
        }
        return true
    }
}