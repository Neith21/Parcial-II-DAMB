package com.example.parcial_ii_cristianarielchaveztorres.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_ii_cristianarielchaveztorres.R
import com.example.parcial_ii_cristianarielchaveztorres.SaladMenu

class SaladMenuViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val saladImage = view.findViewById<ImageView>(R.id.salad_image)
    val saladName = view.findViewById<TextView>(R.id.salad_name)
    val saladPrice = view.findViewById<TextView>(R.id.salad_price)

    fun bind(saladMenu: SaladMenu) {
        saladImage.setImageResource(saladMenu.saladImage)
        saladName.text = saladMenu.saladName
        saladPrice.text = "Desde: $${saladMenu.saladPrice}"
    }
}