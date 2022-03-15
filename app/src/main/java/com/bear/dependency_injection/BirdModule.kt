package com.bear.dependency_injection

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class BirdModule {
    @Provides
    @Named("Canary")
    fun providesCanary(): Bird = Canary()

    @Provides
    @Named("Humming")
    fun providesHummingbird(): Bird = Hummingbird()
}