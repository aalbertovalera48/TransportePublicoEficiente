package com.example.transportepublicoeficiente

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AlertsActivity : AppCompatActivity() {
    private val CHANNEL_ID = "alerts_channel"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alerts)

        createNotificationChannel()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewAlerts)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AlertsAdapter(getAlerts())

        // Enviar notificaciones para cada alerta
        getAlerts().forEachIndexed { index, alert ->
            sendNotification(index, alert)
        }
    }

    private fun getAlerts(): List<String> {
        return listOf(
            "Alerta: Ruta 1 retrasada por tráfico",
            "Alerta: Ruta 2 cerrada temporalmente por mantenimiento",
            "Alerta: Ruta 3 operando con horario reducido",
            "Alerta: Ruta 4 con alta carga de pasajeros",
            "Alerta: Ruta 5 desvío por construcción en la carretera"
        )
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Alertas"
            val descriptionText = "Canal para alertas de transporte público"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun sendNotification(id: Int, message: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (checkSelfPermission(android.Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
                val builder = NotificationCompat.Builder(this, CHANNEL_ID)
                    .setSmallIcon(R.drawable.ic_notification)
                    .setContentTitle("Alerta de Transporte")
                    .setContentText(message)
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)

                with(NotificationManagerCompat.from(this)) {
                    notify(id, builder.build())
                }
            } else {
                // Request the permission
                requestPermissions(arrayOf(android.Manifest.permission.POST_NOTIFICATIONS), 1)
            }
        } else {
            val builder = NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_notification)
                .setContentTitle("Alerta de Transporte")
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)

            with(NotificationManagerCompat.from(this)) {
                notify(id, builder.build())
            }
        }
    }
}