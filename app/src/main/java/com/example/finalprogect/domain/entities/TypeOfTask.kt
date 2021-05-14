package com.example.finalprogect.domain.entities

import androidx.room.Entity

@Entity(tableName = "type_of_task_table")
data class TypeOfTask(
    val id: Int,
    val name: String
)
