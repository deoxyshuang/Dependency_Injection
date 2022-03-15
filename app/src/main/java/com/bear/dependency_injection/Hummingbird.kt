package com.bear.dependency_injection

import android.util.Log

class Hummingbird: Bird() {
    override fun peck() {
        Log.d(TAG, "Hummingbird peck")
    }
}