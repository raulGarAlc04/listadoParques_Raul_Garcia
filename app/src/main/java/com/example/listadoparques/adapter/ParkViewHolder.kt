package com.example.listadoparques.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listadoparques.Park
import com.example.listadoparques.databinding.ItemParkBinding

class ParkViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemParkBinding.bind(view)
    fun render(parkModel: Park) {
        binding.nombreParque.text = parkModel.nombre
        binding.descripcionParque.text = parkModel.descripcion
        // Depende de la conexion que tengas (la de mi casa es lenta) las imagenes tardarán más o menos en cargar
        Glide.with(binding.imagenParque.context).load(parkModel.photo).into(binding.imagenParque)

        itemView.setOnClickListener() { Toast.makeText(binding.imagenParque.context, parkModel.nombre, Toast.LENGTH_LONG).show()}
    }
}