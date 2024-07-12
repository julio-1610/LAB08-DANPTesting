package com.example.lab08_testing.login

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.Mockito.verify

@RunWith(MockitoJUnitRunner::class)
class LoginModelTest {

    @Mock
    private lateinit var presenter: Login.Presenter

    private lateinit var model: LoginModel

    @Before
    @Throws(Exception::class)
    fun setUp() {
        model = LoginModel(presenter)
    }

    @Test
    @Throws(Exception::class)
    fun shouldSuccessWithValidUserAndPass() {
        model.validaUser("julio", "161002")
        verify(presenter).usarioValido()
    }

    @Test
    @Throws(Exception::class)
    fun shouldNotSuccessWithInvalidUserAndPass() {
        model.validaUser("pepe", "androiddesdecero")
        verify(presenter).error()
    }
}
