package com.example.first_practice

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View
import android.widget.TextView

class MainActivity : WearableActivity() {

    val textito: TextView = findViewById(R.id.textView2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)
        // Enables Always-on
        setAmbientEnabled()
    }

    fun alo(view: View){
        textito.text = "Gatito"
    }

}