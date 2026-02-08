package com.miguelangelbusatoriblanco.pmd

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflamos el layout manualmente (REQUISITO DEL EJERCICIO)
        val inflater: LayoutInflater = layoutInflater
        val view: View = inflater.inflate(R.layout.activity_login, null)
        setContentView(view)

        val etUsuario = view.findViewById<EditText>(R.id.etUsuario)
        val etPassword = view.findViewById<EditText>(R.id.etPassword)
        val btnLogin = view.findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val usuario = etUsuario.text.toString()
            val password = etPassword.text.toString()

            if (usuario.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, InicioActivity::class.java)
                intent.putExtra("usuario", usuario)
                startActivity(intent)
            } else {
                Toast.makeText(
                    this,
                    "Debes rellenar todos los campos",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}