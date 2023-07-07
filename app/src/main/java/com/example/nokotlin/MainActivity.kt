package com.example.nokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout


class MainActivity : AppCompatActivity() {

    public fun click(View : View)
    {
        val ordermsg: String  ="com.example.nokotlin.msg"
        intent= Intent (this,SecondActivity::class.java)
        intent.putExtra(ordermsg, "Harsh")
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}