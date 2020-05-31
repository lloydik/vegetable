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
    var work = true
    fun playEvent(view: View){
        var workSecs: Int = ettw.text.toString().toInt() * 60
        val interval: Long = 500
        Timer("SettingUp", false).schedule(interval) {
            seconds++
            if((seconds > workSecs) && (work))
                work = false
            txtime.setText(workSecs.toString())
        }
    }
}