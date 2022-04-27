package com.bittslife.androidarchitecturecomponent

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.e(TAG, "onCreate: Observer", )
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        Log.e(TAG, "onStart: Observer")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.e(TAG, "onResume: Observer")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.e(TAG, "onPause: Observer")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.e(TAG, "onStop: Observer")
    }

    /*@OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onRestart() {
        Log.e(TAG, "onRestart: Observer")
    }*/

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.e(TAG, "onDestroy: Observer")
    }

    /*@OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onSaveInstanceState(outState: Bundle) {
        Log.e(TAG, "onSaveInstanceState: Observer")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.e(TAG, "onRestoreInstanceState: Observer" )
    }*/

}