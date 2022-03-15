package com.bear.dependency_injection

import android.util.Log

class Canary : Bird(), Fly {
    override fun peck() {
        Log.d(TAG, "Canary peck")
    }
    override fun fly() {
        Log.d(TAG, "Canary can fly")
    }
}