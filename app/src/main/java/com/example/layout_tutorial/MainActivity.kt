package com.example.layout_tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myObject = MyObject()

        val dialog = MyCustomDialog(this)


        val mySingleton = MySingleton(this)


        val myNomalClass_1 = MyNomalClass()
        val myNomalClass_2 = MyNomalClass()

        Log.d("peavyTAG, ","myNomalClass_1 : $myNomalClass_1")
        Log.d("peavyTAG, ","myNomalClass_1 : $myNomalClass_2")

        val mySingletonClass_1 = MySingletonClass
        val mySingletonClass_2 = MySingletonClass

        Log.d("peavyTAG, ","mySingletonClass_1 : $mySingletonClass_1")
        Log.d("peavyTAG, ","mySingletonClass_2 : $mySingletonClass_2")



        val textView : TextView = findViewById(R.id.textView)
        textView.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "call", Toast.LENGTH_LONG).show()
            val intent = Intent(this, second_activity::class.java)
            startActivity(intent)
        })

//        textView.setOnClickListener {
//
//        }

        _printMessage("jjh")
        _printMessage(name = "jjh", "hi")
        _printMessage(prefix = "hello", name = "jjh")
        _printall("jjh", "nna", "jjh1", "jjh2")
    }


    private fun _printall(vararg str : String) {


        _log(*str)

    }

    private fun _log(vararg str : String) {
        for(fuck in str) {
            println("test  : $fuck")
        }
    }

    fun _printMessage(name: String) {

    }

    fun _printMessage(name : String , prefix : String = "hi") {

    }


}