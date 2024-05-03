package com.tntapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //Utilizados para la validación
    private var success : Boolean = false
    private var user : String = "admin"
    private var pass : String = "tnt2024"

    //Datos ingresados por el usuario
    private var userText : String? = null
    private var passText : String? = null

    //Elementos graficos
    private lateinit var loginButton: Button
    private lateinit var userEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById(R.id.botonLogin)
        userEditText = findViewById(R.id.userEditText)
        passwordEditText = findViewById(R.id.passwordEditText)

        loginButton.setOnClickListener {

            userText = userEditText.text.toString()
            passText = passwordEditText.text.toString()

            validar(userText!!, passText!!)

            if (success) {
                val intent = Intent(this, MasterActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Inicio de sesión fallido.", Toast.LENGTH_SHORT).show()
            }

        }

    }

    private fun validar(userText:String, passText:String) {
        success = (userText == user) && (passText == pass)
    }


}
