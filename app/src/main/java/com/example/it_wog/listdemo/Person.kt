package com.example.it_wog.listdemo

data class Person (val name: String, val alter: Int, val note: String){

    override fun toString(): String {
        return "$name ($alter) Jahre"
    }

}