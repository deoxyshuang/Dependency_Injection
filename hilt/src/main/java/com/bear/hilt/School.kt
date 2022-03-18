package com.bear.hilt

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class School @Inject constructor() {
    fun show() = Log.d("####","there is a School")
}