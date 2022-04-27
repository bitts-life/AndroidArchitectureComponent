package com.bittslife.androidarchitecturecomponent

import androidx.lifecycle.ViewModel

class MainViewModel(val value: Int): ViewModel() {

    var counter = value

    fun increment() {
        counter++
    }

}