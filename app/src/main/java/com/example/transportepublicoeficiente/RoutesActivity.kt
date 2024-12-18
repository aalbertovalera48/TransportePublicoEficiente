package com.example.transportepublicoeficiente

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RoutesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_routes)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewRoutes)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RoutesAdapter(getRoutes())
    }

    private fun getRoutes(): List<String> {
        return listOf(
            "Autobús Ruta 1: Centro a Norte",
            "Autobús Ruta 2: Estación Central al Aeropuerto",
            "Metro Línea 1: Este a Oeste",
            "Metro Línea 2: Parque Norte a Parque Sur",
            "Tranvía Línea 1: Centro de la Ciudad a los Suburbios"
        )
    }
}