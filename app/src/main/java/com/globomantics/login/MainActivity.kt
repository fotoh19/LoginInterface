package com.globomantics.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var logginVerification = LoginVerification()
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var login: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        email = findViewById(R.id.editetextemile)
        password = findViewById(R.id.editTextPassword)
        login = findViewById(R.id.button)

        login.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (logginVerification.Verify(
                email.text.toString(),
                password.text.toString()
            )
        ) {
            Toast.makeText(this, "login successful", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "login feild", Toast.LENGTH_SHORT).show()

        }
    }
}