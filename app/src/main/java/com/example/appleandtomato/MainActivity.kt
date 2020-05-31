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
    }
    var seconds = 0
    fun setOnClickListener(view: View){
        var workSecs: Int = ettw.text.toString().toInt()
        val interval: Long = 500
        Timer("SettingUp", false).schedule(interval) {

        }
        txtime.setText(workSecs.toString())
    }
}