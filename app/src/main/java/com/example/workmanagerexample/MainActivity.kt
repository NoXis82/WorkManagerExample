package com.example.workmanagerexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.workmanagerexample.ui.theme.WorkManagerExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val channel =
//            NotificationChannel("default", "Default", NotificationManager.IMPORTANCE_DEFAULT)
//        val notificationManager = getSystemService(NotificationManager::class.java)
//        notificationManager.createNotificationChannel(channel)

//        val workerRequestOneTime = OneTimeWorkRequestBuilder<CustomWorker>()
//            .setInitialDelay(Duration.ofSeconds(TIME_DURATION))
//            .setBackoffCriteria(
//                BackoffPolicy.LINEAR,
//                Duration.ofSeconds(TIME_DURATION_BACK)
//            )
//            .build()

//        val constraints = Constraints.Builder()
//            .setRequiresCharging(true)
//            .build()

        //       val workRequestPeriodic =
        //           PeriodicWorkRequestBuilder<CustomWorker>(
        //               repeatInterval = Duration.ofSeconds(TIME_DURATION_REPEAT)
        //           )
//                .setConstraints(constraints)
        //             .build()

//        val listWork = listOf(workRequestPeriodic)
//        val workManager = WorkManager.getInstance(applicationContext).enqueue(listWork)

        setContent {
            WorkManagerExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    companion object {
        const val TIME_DURATION = 10L
        const val TIME_DURATION_REPEAT = 15L
        const val TIME_DURATION_BACK = 15L
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WorkManagerExampleTheme {
        Greeting("Android")
    }
}
