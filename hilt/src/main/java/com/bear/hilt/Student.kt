package com.bear.hilt

import android.util.Log
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class Student @AssistedInject constructor(@Assisted private val name: String){
    fun showName() = Log.d("####", "$name")

    @AssistedFactory
    interface StudentFactory {
        fun create(name: String): Student
    }
}