package com.raywenderlich.android.rwandroidtutorial.base


// define the basic methods that a View must have and override
interface BaseView<T> {
    fun setPresenter(presenter : T)
}
