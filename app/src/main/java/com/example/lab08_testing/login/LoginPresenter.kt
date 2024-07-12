package com.example.lab08_testing.login

import com.example.lab08_testing.login.Login.Presenter

class LoginPresenter(private val view: Login.View?) : Presenter {
    private val model: Login.Model = LoginModel(this)

    override fun validaUser(user: String?, pass: String?) {
        if (view != null) {
            model.validaUser(user, pass)
        }
    }

    override fun usarioValido() {
        view?.usarioValido()
    }

    override fun error() {
        view?.error()
    }
}