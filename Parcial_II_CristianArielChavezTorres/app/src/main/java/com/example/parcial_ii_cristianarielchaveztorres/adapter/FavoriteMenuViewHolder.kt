package com.example.parcial_ii_cristianarielchaveztorres.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_ii_cristianarielchaveztorres.FavoriteMenu
import com.example.parcial_ii_cristianarielchaveztorres.R

class FavoriteMenuViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val favoriteImage = view.findViewById<ImageView>(R.id.favorite_image)
    val favoriteName = view.findViewById<TextView>(R.id.favorite_name)
    val favoritePrice = view.findViewById<TextView>(R.id.favorite_price)

    fun bind(favoriteMenu: FavoriteMenu) {
        favoriteImage.setImageResource(favoriteMenu.favoriteImage)
        favoriteName.text = favoriteMenu.favoriteName
        favoritePrice.text = "Desde: $${favoriteMenu.favoritePrice}"
    }
}