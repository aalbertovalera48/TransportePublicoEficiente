package com.example.transportepublicoeficiente

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSchedules: Button = findViewById(R.id.btnSchedules)
        val btnRoutes: Button = findViewById(R.id.btnRoutes)
        val btnAlerts: Button = findViewById(R.id.btnAlerts)

        btnSchedules.setOnClickListener {
            startActivity(Intent(this, SchedulesActivity::class.java))
        }

        btnRoutes.setOnClickListener {
            startActivity(Intent(this, RoutesActivity::class.java))
        }

        btnAlerts.setOnClickListener {
            startActivity(Intent(this, AlertsActivity::class.java))
        }
    }
}