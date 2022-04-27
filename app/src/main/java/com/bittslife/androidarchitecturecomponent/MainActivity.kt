package com.bittslife.androidarchitecturecomponent

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var textViewCounter: TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(10)).get(MainViewModel::class.java)
        textViewCounter = findViewById(R.id.tvCounter)
        setText()
    }

    fun increment(view: View){
        mainViewModel.increment()
        setText()
    }

    private fun setText() {
        textViewCounter.text = mainViewModel.counter.toString()
    }

}