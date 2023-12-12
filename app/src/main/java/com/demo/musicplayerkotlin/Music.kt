package com.demo.musicplayerkotlin

import android.util.Log
import java.util.concurrent.TimeUnit

data class Music(val id:String,
            val title:String,
            val album:String,
            val artist:String,
            val duration: Long = 0,
            val path: String,
            val artUri: String)

fun formatDuration(duration: Long) : String {
    val minutes = TimeUnit.MINUTES.convert(duration, TimeUnit.MILLISECONDS)
    var seconds = TimeUnit.SECONDS.convert(duration, TimeUnit.MINUTES) -
            minutes * TimeUnit.SECONDS.convert(1, TimeUnit.MINUTES)
    if (seconds >= 100) {
        seconds = seconds.toString().substring(0, 2).toLong()
    }


    return String.format("%02d:%02d", minutes, seconds)

}