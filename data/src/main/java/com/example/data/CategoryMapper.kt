package com.example.data

import com.example.data.entities_db.CategoryDB
import com.example.domain.entities.Category

fun CategoryDB.toDomainModel() = Category(
    id = id,
    name = name
)