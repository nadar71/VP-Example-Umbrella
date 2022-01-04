package com.raywenderlich.android.rwandroidtutorial.Main

import com.raywenderlich.android.rwandroidtutorial.model.WeatherState
import com.raywenderlich.android.rwandroidtutorial.base.BasePresenter
import com.raywenderlich.android.rwandroidtutorial.base.BaseView


// Create the contract, using the interface inheritance
interface MainContract {
    interface Presenter : BasePresenter {
            fun onViewCreated()
            fun onLoadWeatherTapped()
    }

    interface View : BaseView<Presenter> {
            fun displayWeatherState(weatherState: WeatherState)
    }
}
