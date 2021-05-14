package com.example.data.entities_db

import androidx.room.Entity

@Entity(tableName = "category_table")
data class CategoryDB(
    val id: Int,
    val name: String
)