package com.bear.dependency_injection

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
class FlyModule(private val sno: String,private val name: String) {

    @Singleton
    @Provides
    @Named("Canary")
    fun providesCanary(): Fly = Canary()

    @Provides
    //@Named("Bumblebee")
    @Bee
    fun providesBumblebee(@Named("sno") sno: String,@Named("name") name: String): Fly = Bumblebee(sno,name)

    @Provides
    @Named("sno")
    fun providesSno() = sno

    @Provides
    @Named("name")
    fun providesName() = name

    // 自定義annotation
    @Qualifier
    annotation class Bee
}