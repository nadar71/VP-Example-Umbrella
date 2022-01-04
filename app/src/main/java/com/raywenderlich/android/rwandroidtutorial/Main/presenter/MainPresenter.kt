package com.raywenderlich.android.rwandroidtutorial.Main.presenter

import com.raywenderlich.android.rwandroidtutorial.Main.MainContract
import com.raywenderlich.android.rwandroidtutorial.Weather
import com.raywenderlich.android.rwandroidtutorial.repository.WeatherRepository
import com.raywenderlich.android.rwandroidtutorial.model.WeatherState
import com.raywenderlich.android.rwandroidtutorial.di.DependencyInjector

// 1
class MainPresenter(view: MainContract.View,
                    dependencyInjector: DependencyInjector)
    : MainContract.Presenter {
    // 2
    private val weatherRepository: WeatherRepository
            = dependencyInjector.weatherRepository()

    // 3
    private var view: MainContract.View? = view

    override fun onDestroy() {
        this.view = null
    }

    override fun onViewCreated() {
          loadWeather()
    }

    override fun onLoadWeatherTapped() {
          loadWeather()
    }

    private fun loadWeather() {
        val weather = weatherRepository.loadWeather()
        val weatherState = weatherStateForWeather(weather)
        view?.displayWeatherState(weatherState)
    }

    private fun weatherStateForWeather(weather: Weather) : WeatherState {
        if (weather.rain!!.amount!! > 0) {
            return WeatherState.RAIN
        }
        return WeatherState.SUN
    }
}

