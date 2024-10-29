package com.example.parcial_ii_cristianarielchaveztorres.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_ii_cristianarielchaveztorres.R
import com.example.parcial_ii_cristianarielchaveztorres.SaladMenu

class SaladMenuAdapter(private val saladMenuList: List<SaladMenu>): RecyclerView.Adapter<SaladMenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SaladMenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_salad_menu,parent,false)
        return SaladMenuViewHolder(view)
    }

    override fun getItemCount(): Int {
        return saladMenuList.size
    }

    override fun onBindViewHolder(holder: SaladMenuViewHolder, position: Int) {
        holder.bind(saladMenuList[position])
    }
}