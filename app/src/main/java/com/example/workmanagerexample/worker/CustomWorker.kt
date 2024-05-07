package com.example.workmanagerexample.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class CustomWorker(
    context: Context,
    workerParameters: WorkerParameters
) : Worker(context, workerParameters) {
    override fun doWork(): Result {
        println("Hello worker")
        return Result.success()
    }

}

//val notification = NotificationCompat.Builder(applicationContext, "default")
//    .setSmallIcon(
//        androidx.loader.R.drawable.notification_bg)
//    .setContentTitle("Task completed")
//    .setContentText("The background task has completed successfully.")
//    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//    .build()
//
//// Perform the background task here,
//// such as displaying a notification
//NotificationManagerCompat.from(applicationContext).notify(1, notification)
//return Result.success()