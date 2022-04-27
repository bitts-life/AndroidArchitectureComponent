package com.bittslife.androidarchitecturecomponent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.e(TAG, "onCreate: activity")

        findViewById<TextView>(R.id.textView).setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart: activity")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: activity")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: activity")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop: activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart: activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: activity")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e(TAG, "onSaveInstanceState: activity")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e(TAG, "onRestoreInstanceState: activity" )
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.e(TAG, "onRestoreInstanceState: activity" )
    }
}