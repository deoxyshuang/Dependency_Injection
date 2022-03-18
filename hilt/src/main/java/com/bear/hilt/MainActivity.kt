package com.bear.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var school1: School

    @Inject
    lateinit var school2: School

    @Inject
    @Named("eng")
//    @CourseModule.BindCh
    lateinit var eng: Course

    @Inject
    lateinit var ch: Chinese

    @Inject
    lateinit var studentFactory: Student.StudentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        school1.show()
        Log.d("####","school1=$school1,,school2=$school2")

        eng.getCredits()
        ch.findTeacher()

        val student = studentFactory.create("Ruby")
        student.showName()
    }
}