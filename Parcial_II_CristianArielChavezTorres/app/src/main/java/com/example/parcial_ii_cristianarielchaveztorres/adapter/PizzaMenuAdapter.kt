package com.example.parcial_ii_cristianarielchaveztorres.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_ii_cristianarielchaveztorres.PizzaMenu
import com.example.parcial_ii_cristianarielchaveztorres.R

class PizzaMenuAdapter(private val pizzaMenuList: List<PizzaMenu>, private val onClickListener: (PizzaMenu)->Unit): RecyclerView.Adapter<PizzaMenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaMenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pizza_menu,parent,false)
        return PizzaMenuViewHolder(view, onClickListener)
    }

    override fun getItemCount(): Int {
        return pizzaMenuList.size
    }

    override fun onBindViewHolder(holder: PizzaMenuViewHolder, position: Int) {
        holder.bind(pizzaMenuList[position])
    }
}