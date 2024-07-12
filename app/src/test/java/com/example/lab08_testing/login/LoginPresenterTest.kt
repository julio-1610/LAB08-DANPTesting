package com.example.lab08_testing.login

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`

@RunWith(MockitoJUnitRunner::class)
class LoginPresenterTest {

    @Mock
    private lateinit var view: Login.View
    @Mock
    private lateinit var model: Login.Model

    private lateinit var presenter: LoginPresenter

    @Before
    @Throws(Exception::class)
    fun setUp() {
        presenter = LoginPresenter(view)
    }

    @Test
    @Throws(Exception::class)
    fun shouldShowErrorMessageWhenUserOrPasswordIsWrong() {
        `when`(view.getUserName()).thenReturn("pepe")
        `when`(view.getPassword()).thenReturn("lucho" +
                "")
        presenter.validaUser(view.getUserName(), view.getPassword())
        verify(view).error()
    }

    @Test
    @Throws(Exception::class)
    fun shouldPassWhenUserAndPasswordAreRight() {
        `when`(view.getUserName()).thenReturn("julio")
        `when`(view.getPassword()).thenReturn("161002")
        presenter.validaUser(view.getUserName(), view.getPassword())
        verify(view).usarioValido()
    }
}
