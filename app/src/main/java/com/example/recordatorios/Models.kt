package com.example.recordatorios

data class Reminder(
    val title: String,
    val category: Category,
    val priority: Priority,
    val status: ReminderStatus,
    val description: String? = null
)

data class Category(
    val name: String
)

sealed class Priority(val label: String) {
    data object High : Priority("Alta")
    data object Medium : Priority("Media")
    data object Low : Priority("Baja")
}

sealed class ReminderStatus(val label: String) {
    data object Pending : ReminderStatus("Pendiente")
    data object Completed : ReminderStatus("Completado")
    data object Postponed : ReminderStatus("Pospuesto")
}
