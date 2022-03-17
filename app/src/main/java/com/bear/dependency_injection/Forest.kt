package com.bear.dependency_injection

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Forest @Inject constructor() {

    @Inject
    @field:Named("Canary")
    lateinit var canary1: Fly

    @Inject
    @field:Named("Canary")
    lateinit var canary2: Fly

    @Inject
    @field:FlyModule.Bee
    lateinit var bee: Fly

    /*@Inject
    @field:Named("Humming")*/
    @field:[Inject Named("Humming")]
    lateinit var hummingbird: Bird

    fun exist() {
        Log.d(TAG, "forest exist")
        canary1.fly()
        canary2.fly()
        Log.d(TAG, "canary1=${canary1}")
        Log.d(TAG, "canary2=${canary2}")
        bee.fly()
        hummingbird.peck()
    }
}