package com.example.data.entities_db

import androidx.room.Entity

@Entity(tableName = "type_of_task_table")
data class TypeOfTaskDb(
    val id: Int,
    val name: String
)
