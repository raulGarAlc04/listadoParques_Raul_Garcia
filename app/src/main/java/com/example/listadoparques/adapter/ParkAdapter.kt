package com.example.listadoparques.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadoparques.Park
import com.example.listadoparques.ParkProvider
import com.example.listadoparques.R

class ParkAdapter(var parkList: List<Park>): RecyclerView.Adapter<ParkViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ParkViewHolder(layoutInflater.inflate(R.layout.item_park, parent, false))
    }

    override fun getItemCount(): Int {
        return ParkProvider.parkList.size
    }

    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) {
        val item = parkList[position]
        holder.render(item)
    }

    fun actualizarParques(parklist: List<Park>) {
        this.parkList = parklist
        notifyDataSetChanged()
    }
}