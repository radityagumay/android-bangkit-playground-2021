package com.bangkit.playground

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.verifyNoMoreInteractions

@RunWith(MockitoJUnitRunner::class)
class MainPresenterImplTest {

    private val view = mock(MainContract.View::class.java)
    private val presenter = MainPresenterImpl(view)

    @Test
    fun verifyDoWork() {
        presenter.doWork()

        verify(view).showToast("hello world")
        verifyNoMoreInteractions(view)
    }
}