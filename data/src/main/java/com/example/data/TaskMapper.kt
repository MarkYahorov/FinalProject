package com.example.data

import com.example.data.entities_db.TaskDB
import com.example.domain.entities.Task

fun TaskDB.toDomainModel() = Task(
    id = id,
    title = title,
    icon = icon,
    color = color,
    number = number,
    rememberTime = rememberTime,
    categoryId = categoryId,
    typeOfTaskId = typeOfTaskId
)