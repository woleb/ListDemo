package com.example.it_wog.listdemo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar_layout)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val meinIntent = getIntent()
        val name: String = meinIntent.getStringExtra("userName")
        val alter: String = meinIntent.getStringExtra("userAlter")
        val note: String = meinIntent.getStringExtra("userNote")
        val farbe: String = meinIntent.getStringExtra("userColor")
        Log.i("TEST", name + alter + note + farbe)

        toolbar3.title = name + " " + alter
        toolbar3.setBackgroundColor(farbe.toInt())
        //contentText.text = note
    }



}
