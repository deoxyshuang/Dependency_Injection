package com.bear.dependency_injection

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
class FlyModule {
    @Singleton
    @Provides
    @Named("Canary")
    fun providesCanary(): Fly = Canary()

    @Provides
    //@Named("Bumblebee")
    @Bee
    fun providesBumblebee(): Fly = Bumblebee()

    // 自定義annotation
    @Qualifier
    annotation class Bee
}