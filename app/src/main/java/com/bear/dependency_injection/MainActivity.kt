package com.bear.dependency_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

const val TAG = "####"

class MainActivity : AppCompatActivity() {
    /*companion object {
        val TAG = MainActivity::class.java.simpleName
    }*/

    @Inject
    lateinit var forest: Forest

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerNaturalComponent.create().inject(this)
        forest.exist()
    }
}