package com.miguelangelbusatoriblanco.pmd

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ContactoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Inflamos la vista (requisito del taller)
        val view = layoutInflater.inflate(R.layout.activity_contacto, null)
        setContentView(view)

        // 2. Referenciamos el botón de enviar
        val btnEnviar = view.findViewById<Button>(R.id.btnEnviar)

        // 3. Acción al pulsar el botón
        btnEnviar.setOnClickListener {
            // Creamos el Intent para volver a Inicio
            val intent = Intent(this, InicioActivity::class.java)

            // Pasamos el mensaje (puedes personalizarlo con los datos del EditText si quieres)
            intent.putExtra("contacto", "Mensaje enviado correctamente")

            // Iniciamos la actividad y mostramos un aviso rápido
            Toast.makeText(this, "Enviando datos...", Toast.LENGTH_SHORT).show()
            startActivity(intent)

            // Opcional: cerramos esta pantalla para que no quede en la pila
            finish()
        }
    }
}