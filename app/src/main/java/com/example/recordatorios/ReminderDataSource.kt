package com.example.recordatorios

import androidx.compose.ui.graphics.Color

object ReminderDataSource {

    private val categoriesList = listOf(
        Category("Trabajo"),
        Category("Estudio"),
        Category("Personal"),
        Category("Salud"),
        Category("Trabajo") // repetida a propósito para demostrar Set
    )

    val uniqueCategories: Set<Category> = categoriesList.toSet()

    val categoryColors: Map<String, Color> = mapOf(
        "Trabajo" to Color(0xFF1565C0),
        "Estudio" to Color(0xFF2E7D32),
        "Personal" to Color(0xFF6A1B9A),
        "Salud" to Color(0xFFD32F2F)
    )

    fun getReminders(): List<Reminder> {
        return listOf(
            Reminder(
                title = "Entregar actividad",
                category = Category("Estudio"),
                priority = Priority.High,
                status = ReminderStatus.Pending,
                description = "Subir el PDF antes del cierre."
            ),
            Reminder(
                title = "Llamar al médico",
                category = Category("Salud"),
                priority = Priority.Medium,
                status = ReminderStatus.Postponed
            ),
            Reminder(
                title = "Reunión con el equipo",
                category = Category("Trabajo"),
                priority = Priority.High,
                status = ReminderStatus.Completed
            ),
            Reminder(
                title = "Comprar materiales",
                category = Category("Personal"),
                priority = Priority.Low,
                status = ReminderStatus.Pending
            )
        )
    }
}
