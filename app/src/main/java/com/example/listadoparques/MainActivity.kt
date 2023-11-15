package com.example.listadoparques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadoparques.adapter.ParkAdapter
import com.example.listadoparques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ParkAdapter(ParkProvider.parkList)
        binding.recyclerPark.adapter = adapter
        binding.recyclerPark.layoutManager = LinearLayoutManager(this)


        binding.filtro.addTextChangedListener {filtro ->
            val filtroParque = ParkProvider.parkList.filter {park ->
                park.nombre.lowercase().contains(filtro.toString().lowercase()) }
            adapter.actualizarParques(filtroParque)
        }
    }
}