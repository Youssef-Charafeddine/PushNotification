package com.example.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Build

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun createChannel()
    {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {
            val n = "Youssef"
            val descText = "channel"
            val imp = NotificationManager.IMPORTANCE_DEFAULT
            val ch = NotificationChannel(PushNoti.CHANNEL_ID, n, imp).apply {
                description = descText
            }

            val notiManager: NotificationManager= getSystemService(Context.NOTIFICATION_SERVICE)as NotificationManager
                    notiManager.createNotificationChannel(ch)
        }

    }
}