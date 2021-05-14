package com.example.data

import com.example.domain.entities.Task

interface Repository {

    suspend fun addTask(task: Task)

    suspend fun getAll(): List<Task>

    suspend fun updateTask(task: Task)

    suspend fun deleteTask(task: Task)

    suspend fun deleteAllTasks()

}