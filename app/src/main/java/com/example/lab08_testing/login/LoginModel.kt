package com.example.lab08_testing.login

import com.example.lab08_testing.login.Login.Presenter

class LoginModel(private val presenter: Presenter) : Login.Model {
    override fun validaUser(user: String?, pass: String?) {
        if (user == "julio" && pass == "161002") {
            presenter.usarioValido()
        } else {
            presenter.error()
        }
    }
}