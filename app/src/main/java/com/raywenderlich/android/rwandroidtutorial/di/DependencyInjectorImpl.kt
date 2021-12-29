package com.raywenderlich.android.rwandroidtutorial.di

import com.raywenderlich.android.rwandroidtutorial.repository.WeatherRepository
import com.raywenderlich.android.rwandroidtutorial.repository.WeatherRepositoryImpl

class DependencyInjectorImpl : DependencyInjector {
    override fun weatherRepository() : WeatherRepository {
            return WeatherRepositoryImpl()
    }
}
