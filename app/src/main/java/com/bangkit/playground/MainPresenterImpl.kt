package com.bangkit.playground

class MainPresenterImpl(
    private val view: MainContract.View
) : MainContract.Presenter {

    override fun doWork() {
        view.showToast("hello world")
    }
}