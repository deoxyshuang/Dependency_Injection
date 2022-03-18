package com.bear.hilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class) //把此模組安裝到Activity組件中(含Fragment、View)，使用此模組提供的依賴注入實例
abstract class CourseModule {

    @Binds
    @Named("eng")
    abstract fun bindEng(english: English): Course

    @Binds
    @BindCh
    abstract fun bindCh(chinese: Chinese): Course


    @Qualifier //給繼承同類別或實作同介面 注入不同實例
    @Retention(AnnotationRetention.BINARY) //聲明註解的作用範圍，AnnotationRetention.BINARY表示該註解在編譯之後獲得保留，無法透過反射去訪問該註解
    annotation class BindCh
}