package com.raywenderlich.android.rwandroidtutorial.base


// define the basic methods that a Presenter must have and override
interface BasePresenter {
      fun onDestroy()  // used to detach the view and avoid memory leaks
}
