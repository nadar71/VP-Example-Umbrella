package com.raywenderlich.android.rwandroidtutorial.view

import com.raywenderlich.android.rwandroidtutorial.model.WeatherState
import com.raywenderlich.android.rwandroidtutorial.presenter.BasePresenter

interface MainContract {
    interface Presenter : BasePresenter {
            fun onViewCreated()
            fun onLoadWeatherTapped()
    }

    interface View : BaseView<Presenter> {
            fun displayWeatherState(weatherState: WeatherState)
    }
}
