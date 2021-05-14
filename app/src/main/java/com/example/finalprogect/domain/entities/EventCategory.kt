package com.example.finalprogect.domain.entities

import androidx.room.Entity

@Entity(tableName = "event_category")
data class EventCategory(
    val id: Int,
    val title: String
)
