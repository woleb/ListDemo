package com.example.it_wog.listdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class EigenerAdapter(context: Context, items: ArrayList<Person>):BaseAdapter(){

    private val context: Context
    private val items: ArrayList<Person>

    init {
        this.context = context
        this.items = items
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflator = LayoutInflater.from(context)
        val listeneintrag = layoutInflator.inflate(R.layout.adapter_layout,parent,false)
        val tName = listeneintrag.findViewById<TextView>(R.id.textViewName)
        val tAlter = listeneintrag.findViewById<TextView>(R.id.textViewAlter)
        val tNote = listeneintrag.findViewById<TextView>(R.id.textViewNote)

        tName.text = items.get(position).name
        tName.setTextColor(items.get(position).farbe)
        tAlter.text = items.get(position).alter.toString()
        tNote.text = items.get(position).note

        return listeneintrag
    }
    //get the values stored at the selected position (name, age, note)
    override fun getItem(position: Int): Person {
        return items.get(position)
    }
    //get the position in our list (items)
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    //get the size of our list (items)
    override fun getCount(): Int {
        return items.size
    }
}
