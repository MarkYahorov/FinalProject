package com.example.data.entities_db

import androidx.room.Entity

@Entity(tableName = "task_table")
data class TaskDB(
    val id: Int,
    val title: String,
    val icon: Int,
    val color: Int,
    val number: String?,
    val rememberTime: Int,
    val categoryId: Int,
    val typeOfTaskId: Int
)
