package com.example.data

import com.example.data.entities_db.TypeOfTaskDb
import com.example.domain.entities.TypeOfTask

fun TypeOfTaskDb.toDomainModel() = TypeOfTask(
    id = id,
    name = name
)