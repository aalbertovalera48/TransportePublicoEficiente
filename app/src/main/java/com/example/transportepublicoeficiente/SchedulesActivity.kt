package com.example.transportepublicoeficiente

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SchedulesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedules)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewSchedules)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SchedulesAdapter(getSchedules())
    }

    private fun getSchedules(): List<String> {
        return listOf(
            "Autobús Horario 1: 6:00 AM - 10:00 PM",
            "Autobús Horario 2: 5:30 AM - 11:00 PM",
            "Metro Horario 1: 5:00 AM - 12:00 AM",
            "Metro Horario 2: 6:00 AM - 11:00 PM",
            "Tranvía Horario 1: 7:00 AM - 9:00 PM"
        )
    }
}