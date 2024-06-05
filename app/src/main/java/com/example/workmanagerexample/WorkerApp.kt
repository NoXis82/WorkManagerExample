package com.example.workmanagerexample

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context

class WorkerApp : Application() {

    override fun onCreate() {
        super.onCreate()
        val channel =
            NotificationChannel(
                "download_channel",
                "File Download",
                NotificationManager.IMPORTANCE_DEFAULT
            )
        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
    }
}