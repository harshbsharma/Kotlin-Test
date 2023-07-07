package com.example.nokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.view.WindowManager
import android.view.WindowManager.*
import android.widget.Button
import android.widget.Toolbar
import androidx.appcompat.widget.ButtonBarLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
//        val toolbar : androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar_main)
        window.addFlags(LayoutParams.FLAG_FULLSCREEN)
        val btn:Button = findViewById(R.id.signinbtn)
        btn.setOnClickListener {

            val intent = Intent (this,splash_screen::class.java)
            startActivity(intent)


        }
//        setSupportActionBar(toolbar)
    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.toolbar_menu, menu)
//        return true
//
//    }

}