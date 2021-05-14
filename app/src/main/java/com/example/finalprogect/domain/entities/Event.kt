package com.example.finalprogect.domain.entities

import androidx.room.Entity

@Entity(tableName = "event")
data class Event(
    val id: Int,
    val title:String,
    val image: Int,
    val eventCategoryId: Int
)
