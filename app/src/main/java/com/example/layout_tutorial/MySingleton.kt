package com.example.layout_tutorial

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MySingleton(context: Context) : SQLiteOpenHelper(context, "myDB", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    companion object {
        @Volatile private var instances : MySingleton? = null

        fun getInstance(context: Context) : MySingleton =
            instances ?: synchronized(this) {
                instances ?: MySingleton(context).also {
                    instances = it
                }
            }
    }
}