package com.raywenderlich.android.rwandroidtutorial.di

import com.raywenderlich.android.rwandroidtutorial.repository.WeatherRepository

interface DependencyInjector {
      fun weatherRepository() : WeatherRepository
}