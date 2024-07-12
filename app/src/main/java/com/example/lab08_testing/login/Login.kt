package com.example.lab08_testing.login

interface Login {
    interface View {
        fun usarioValido()
        fun error()
        fun getUserName(): String
        fun getPassword(): String
    }

    interface Presenter {
        fun validaUser(user: String?, pass: String?)
        fun usarioValido()
        fun error()
    }

    interface Model {
        fun validaUser(user: String?, pass: String?)
    }
}