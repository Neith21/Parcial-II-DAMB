package com.example.parcial_ii_cristianarielchaveztorres

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var Toolbar : Toolbar;
    lateinit var navegacion: BottomNavigationView

    private  fun loadFragment(fragment: androidx.fragment.app.Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_container, fragment)
            addToBackStack("replacement")
            commit()
        }
    }

    private val mOnNavMenu = BottomNavigationView.OnNavigationItemSelectedListener { item->
        when(item.itemId){
            R.id.fragment_pizza_menu->{
                loadFragment(fragment_menu())
                true
            }
            R.id.fragment_favorite_pizza->{
                loadFragment(fragment_menu_favorite())
                true
            }
            R.id.fragment_salads->{
                loadFragment(fragment_menu_salad())
                true
            } else -> false
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Toolbar = findViewById(R.id.toolbarSettings);
        Toolbar.title="Pizzería Juan";
        Toolbar.setTitleTextColor(ContextCompat.getColor(this,R.color.white))
        setSupportActionBar(Toolbar);

        navegacion = findViewById(R.id.nav_menu)
        navegacion.setOnNavigationItemSelectedListener(mOnNavMenu)

        if (savedInstanceState == null) {
            loadFragment(fragment_menu())
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_main_menu,menu);
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.nav_search -> {
                Toast.makeText(this, "Selecionó la opción de buscar.", Toast.LENGTH_SHORT).show();
                true
            }
            R.id.nav_giftcard -> {
                Toast.makeText(this, "Selecionó la opción de giftcard.", Toast.LENGTH_SHORT).show();
                true
            }
            R.id.nav_logout -> {
                finishAffinity()
                true
            }
            R.id.nav_Terms_Conditions -> {
                Toast.makeText(this, "Selecionó la opción de términos y condiciones.", Toast.LENGTH_SHORT).show();
                true
            } else -> false;
        }
    }
}