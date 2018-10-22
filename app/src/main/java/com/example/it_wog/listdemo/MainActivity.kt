package com.example.it_wog.listdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<String>()
        items.add("Tom")
        items.add("Manu")
        items.add("Julia")
        items.add("Birgit")
        items.add("Tom")
        items.add("Manu")
        items.add("Julia")
        items.add("Birgit")
        items.add("Tom")
        items.add("Manu")
        items.add("Julia")
        items.add("Birgit")

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items )
        kontaktListe.adapter = adapter
/* Gibt eine Fehlermedlung da setOnClickListener nicht auf Adapter angewendet werden können
        kontaktListe.setOnClickListener {

            Toast.makeText(this, "", Toast.LENGTH_LONG).show()

        }
*/
        //setOnItemClickListener ist die Lösung für diese Listengeschichte
        kontaktListe.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Geklickt wurde: ${items.get(position)}", Toast.LENGTH_LONG).show()
        }





    }





}
