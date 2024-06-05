package com.example.workmanagerexample

import android.app.NotificationManager
import android.content.Context
import android.widget.Toast
import androidx.core.app.NotificationCompat

class DownloadNotificationService(private val context: Context) : NotificationService {

    private val notificationManager =
        context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


    override fun showNotification() {

        val isEnabled = notificationManager.areNotificationsEnabled()

        Toast.makeText(context, "isEnable notification: $isEnabled", Toast.LENGTH_SHORT).show()

        val notification = NotificationCompat.Builder(context, "download_channel")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("Download in progress")
            .setContentText("Downloading...")
            .build()

        notificationManager.notify(1, notification)
    }
}