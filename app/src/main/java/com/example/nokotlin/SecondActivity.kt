package com.example.nokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.ButtonBarLayout
import org.w3c.dom.Text


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data : Bundle? = intent.extras
        val string : String? = intent.getStringExtra("msg")
//        val view : TextView = findViewById()


    }
}