package com.example.parcial_ii_cristianarielchaveztorres

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_ii_cristianarielchaveztorres.adapter.FavoriteMenuAdapter

class fragment_menu_favorite : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu_favorite, container, false)

        recyclerView = view.findViewById(R.id.rv_favorite_menu)
        recyclerView.layoutManager = GridLayoutManager(context, 1)
        recyclerView.adapter = FavoriteMenuAdapter(FavoriteMenuProvider.favoriteMenuList)

        // Pasar listener del adaptador
        /* recyclerView.adapter = FavoriteMenuAdapter(FavoriteMenuProvider.favoriteMenuList) { favoriteMenu ->
            val fragment = fragment_favorite_menu_result().apply {
                arguments = Bundle().apply {
                    putInt("favoriteImage", favoriteMenu.favoriteImage)
                    putString("favoriteName", favoriteMenu.favoriteName)
                    putString("favoritePrice", favoriteMenu.favoritePrice.toString())
                    putString("favoriteDescription", favoriteMenu.favoriteDescription)
                }
            }

            parentFragmentManager.beginTransaction()
                .replace(R.id.frame_container, fragment)
                .addToBackStack(null)
                .commit()
        } */

        return view
    }
}