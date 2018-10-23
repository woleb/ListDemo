package com.example.it_wog.listdemo

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<Person>()
        items.add(Person("Tom", alter = 25, note = "Was", farbe = Color.parseColor("#ea1004"), pic = getDrawable(R.drawable.pers1)))
        items.add(Person("Fritz", alter = 10, note = "Was", farbe = Color.parseColor("#77f442"), pic = getDrawable(R.drawable.pers2)))
        items.add(Person("Joe", alter = 34, note = "Was", farbe = Color.parseColor("#ea1004"), pic = getDrawable(R.drawable.pers3)))
        items.add(Person("Jim", alter = 4, note = "Was", farbe = Color.parseColor("#77f442"), pic = getDrawable(R.drawable.pers1)))
        items.add(Person("Sue", alter = 23, note = "Was", farbe = Color.parseColor("#ea1004"), pic = getDrawable(R.drawable.pers2)))
        items.add(Person("Nadja", alter = 56, note = "Was", farbe = Color.parseColor("#77f442"), pic = getDrawable(R.drawable.pers3)))
        items.add(Person("Emma", alter = 43, note = "Was", farbe = Color.parseColor("#ea1004"), pic = getDrawable(R.drawable.pers1)))
        items.add(Person("Birgit", alter = 25, note = "Was", farbe = Color.parseColor("#77f442"), pic = getDrawable(R.drawable.pers2)))
        items.add(Person("Jakob", alter = 12, note = "Was", farbe = Color.parseColor("#ea1004"), pic = getDrawable(R.drawable.pers3)))
        items.add(Person("Wolle", alter = 32, note = "Was", farbe = Color.parseColor("#77f442"), pic = getDrawable(R.drawable.pers1)))
        items.add(Person("Ed", alter = 43, note = "Was", farbe = Color.parseColor("#ea1004"), pic = getDrawable(R.drawable.pers2)))
        Log.i("TEST", "Bildadresse ${getDrawable(R.drawable.pers1)}")

        //val adapter = ArrayAdapter<Person>(this, android.R.layout.simple_list_item_1, items )
        //kontakliste.adapter = adapter

        kontaktliste.adapter = EigenerAdapter(this, items)

/* Gibt eine Fehlermedlung da setOnClickListener nicht auf Adapter angewendet werden können
        kontaktListe.setOnClickListener {

            Toast.makeText(this, "", Toast.LENGTH_LONG).show()

        }
*/
        //setOnItemClickListener ist die Lösung für diese Listengeschichte
        kontaktliste.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Geklickt wurde: ${items.get(position)}", Toast.LENGTH_LONG).show()
        }





    }





}
