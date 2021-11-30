package com.example.kotlincouroutinestutorial

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        GlobalScope.launch{
            delay(50000L)
            Log.d(TAG,"Coroutines says hello from thread ${Thread.currentThread()}")

        }

        Log.d(TAG," hello from thread ${Thread.currentThread()}")

    }
}