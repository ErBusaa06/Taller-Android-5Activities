package com.miguelangelbusatoriblanco.pmd

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InicioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Inflamos la vista (requisito del taller)
        val view = layoutInflater.inflate(R.layout.activity_inicio, null)
        setContentView(view)

        // 2. Recuperamos el nombre enviado desde LoginActivity
        val usuario = intent.getStringExtra("usuario")
        val tvBienvenida = view.findViewById<TextView>(R.id.tvBienvenida)
        val tvContactoInfo = view.findViewById<TextView>(R.id.tvContactoInfo)

        // Mostramos el nombre en el TextView
        tvBienvenida.text = "Bienvenido, $usuario"

        // 3. Comprobamos si venimos de ContactoActivity con un mensaje
        val infoContacto = intent.getStringExtra("contacto")
        if (infoContacto != null) {
            tvContactoInfo.text = infoContacto
        }

        // --- CONFIGURACIÓN DE LOS BOTONES PARA NAVEGAR ---

        // Botón para ir a Contacto
        view.findViewById<Button>(R.id.btnContacto).setOnClickListener {
            val intent = Intent(this, ContactoActivity::class.java)
            startActivity(intent)
        }

        // Botón para ir a Sobre Nosotros
        view.findViewById<Button>(R.id.btnSobre).setOnClickListener {
            val intent = Intent(this, SobreNosotrosActivity::class.java)
            startActivity(intent)
        }

        // Botón para ir a Localización
        view.findViewById<Button>(R.id.btnLocalizacion).setOnClickListener {
            val intent = Intent(this, LocalizacionActivity::class.java)
            startActivity(intent)
        }
    }
}