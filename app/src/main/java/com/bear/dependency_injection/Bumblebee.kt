package com.bear.dependency_injection

import android.util.Log
import javax.inject.Named

class Bumblebee (private val sno: String,private val name: String) : Fly { //@param:Named("sno")
    override fun fly() {
        Log.d(TAG,"Bumblebee can fly, sno=$sno name=$name")
    }
}