package com.bear.dependency_injection

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [FlyModule::class, BirdModule::class])
interface NaturalComponent {
    fun inject(mainActivity: MainActivity)
}