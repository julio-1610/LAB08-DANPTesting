package com.example.lab08_testing.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lab08_testing.R
import com.example.lab08_testing.finalActivity.FinalActivity
import com.example.lab08_testing.login.Login.Presenter


class LoginActivity : AppCompatActivity(), Login.View {
    private var user: EditText? = null
    private var pass: EditText? = null
    private var presenter: Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        user = findViewById<View>(R.id.edUser) as EditText
        pass = findViewById<View>(R.id.edPass) as EditText
        presenter = LoginPresenter(this)
    }

    override fun usarioValido() {
        startActivity(Intent(this@LoginActivity, FinalActivity::class.java))
    }

    override fun error() {
        Toast.makeText(this, "Usuario no es Valido", Toast.LENGTH_SHORT).show()
    }

    override fun getUserName(): String {
        return user?.text.toString()
    }

    override fun getPassword(): String {
        return pass?.text.toString()
    }
}