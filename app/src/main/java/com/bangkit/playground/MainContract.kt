package com.bangkit.playground

interface MainContract {

    interface Presenter {

        fun doWork()
    }

    interface View {
        fun showToast(message: String)
    }
}