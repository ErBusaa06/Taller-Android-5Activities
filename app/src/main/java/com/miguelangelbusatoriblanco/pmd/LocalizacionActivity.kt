package com.miguelangelbusatoriblanco.pmd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LocalizacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflamos la vista
        val view = layoutInflater.inflate(R.layout.activity_localizacion, null)
        setContentView(view)
    }
}