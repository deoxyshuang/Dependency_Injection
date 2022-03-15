package com.bear.dependency_injection

import android.util.Log

class Bumblebee : Fly {
    override fun fly() {
        Log.d(TAG,"Bumblebee can fly")
    }
}