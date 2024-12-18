# Transporte Público Eficiente

Este proyecto es una aplicación Android diseñada para proporcionar información eficiente sobre el transporte público, incluyendo horarios, rutas y alertas.

## Características

- **Pantalla Principal**: Proporciona acceso a horarios, rutas y alertas.
- **Horarios**: Muestra los horarios de varias opciones de transporte público.
- **Rutas**: Muestra las rutas de diferentes opciones de transporte público.
- **Alertas**: Proporciona alertas relacionadas con el transporte público, como retrasos y cambios de ruta.

## Uso

- **Pantalla Principal**: Navega a horarios, rutas o alertas haciendo clic en los respectivos botones.
- **Horarios**: Visualiza los horarios de diferentes opciones de transporte público.
- **Rutas**: Visualiza las rutas de diferentes opciones de transporte público.
- **Alertas**: Visualiza alertas relacionadas con el transporte público.

## Estructura del Código

- `MainActivity.kt`: Maneja la pantalla principal y la navegación a otras actividades.
- `SchedulesActivity.kt`: Muestra los horarios.
- `RoutesActivity.kt`: Muestra las rutas.
- `AlertsActivity.kt`: Muestra las alertas y envía notificaciones.
- `AlertsAdapter.kt`, `RoutesAdapter.kt`, `SchedulesAdapter.kt`: Adaptadores para los RecyclerViews en las respectivas actividades.

## Permisos

La aplicación requiere los siguientes permisos:
- `android.permission.INTERNET`: Para acceder a internet.
- `android.permission.POST_NOTIFICATIONS`: Para enviar notificaciones (para Android 13 y superior).

## Dependencias

- Bibliotecas de AndroidX
- RecyclerView
- ConstraintLayout

## Desarrollado por

- **aalbertovalera48**
