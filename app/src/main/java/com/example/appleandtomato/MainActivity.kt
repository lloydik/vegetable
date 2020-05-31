package com.example.appleandtomato
import java.util.Timer
import kotlin.concurrent.schedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timer("SettingUp", false).schedule(500) {
            doSomething()
        }
    }
    fun setOnClickListener(view: View){
        var workSecs: Int = txwork.text.toString().toInt()
        workSecs--
        txtime.setText(workSecs.toString())
    }
}