package com.bear.hilt

import android.util.Log
import javax.inject.Inject

class English @Inject constructor() : Course {
    override fun getCredits() {
        Log.d("####", "10 credits")
    }
}