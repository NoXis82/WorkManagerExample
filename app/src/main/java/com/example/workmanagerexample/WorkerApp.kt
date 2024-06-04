package com.example.workmanagerexample

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager

class WorkerApp : Application() {

    override fun onCreate() {
        super.onCreate()
        val channel =
            NotificationChannel(
                "download_channel",
                "File Download",
                NotificationManager.IMPORTANCE_HIGH
            )
        val notificationManager = getSystemService(NotificationManager::class.java)
        notificationManager.createNotificationChannel(channel)
    }
}