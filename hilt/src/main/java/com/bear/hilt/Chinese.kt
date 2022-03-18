package com.bear.hilt

import android.util.Log
import javax.inject.Inject

class Chinese @Inject constructor(val teacher: Teacher) : Course {
    fun findTeacher() = Log.d("####","teach by ${teacher}")
    override fun getCredits() {
        Log.d("####","4 credits")
    }
}