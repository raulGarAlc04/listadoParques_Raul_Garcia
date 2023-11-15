package com.example.listadoparques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.listadoparques.databinding.ActivityAnadirParqueBinding

class AnadirParqueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //val miDialogo = MiDialogFragment()

        val binding = ActivityAnadirParqueBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var cadena_actividades = "Actividades que se pueden realizar en el parque: "

        binding.btnGuardar.setOnClickListener() {
            Log.d("INFORMACION", "Nombre del parque: " + binding.nombre.text)
            Log.d("INFORMACION", "Descripcion del parque: " + binding.descripcion.text)
            Log.d("INFORMACION", "Telefono de contacto del parque: " + binding.telefono.text)
            Log.d("INFORMACION", "Web del parque: " + binding.web.text)

            Log.d("INFORMACION", "Hora de apertura del parque: " + binding.apertura.selectedItem)
            Log.d("INFORMACION", "Hora de cierre del parque: " + binding.cierre.selectedItem)

            if (binding.deportes.isChecked) {
                cadena_actividades += binding.deportes.text
                cadena_actividades += ", "
            }

            if (binding.parqueInfantil.isChecked) {
                cadena_actividades += binding.parqueInfantil.text
                cadena_actividades += ", "
            }

            if (binding.restaurante.isChecked) {
                cadena_actividades += binding.restaurante.text
                cadena_actividades += ", "
            }

            if (binding.zonaMascotas.isChecked) {
                cadena_actividades += binding.zonaMascotas.text
            }

            Log.d("INFORMACION", cadena_actividades)

            //miDialogo.show(supportFragmentManager, "MiDialogo")
        }
    }
}