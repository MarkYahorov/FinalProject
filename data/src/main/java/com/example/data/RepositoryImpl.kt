package com.example.data

import com.example.data.db.DataBase
import com.example.data.db.TaskDao
import com.example.data.entities_db.TaskDB
import com.example.domain.entities.Task

class RepositoryImpl(private val db: DataBase) : Repository {

    override suspend fun addTask(task: Task) {
        db.taskDao().addTask(task.toDb())
    }

    override suspend fun getAll(): List<Task> {
        val taskLiveData: List<TaskDB> = db.taskDao().getAll()
        return fromListTaskToListTaskDb(taskLiveData)
    }

    override suspend fun updateTask(task: Task) {
        db.taskDao().updateTask(task.toDb())
    }

    override suspend fun deleteTask(task: Task) {
        db.taskDao().deleteTask(task.toDb())
    }

    override suspend fun deleteAllTasks() {
        db.taskDao().deleteAllTasks()
    }

    private fun fromListTaskToListTaskDb(listTask: List<TaskDB>): List<Task> {

        return listTask.map {
            it.toDomainModel()
        }

    }
}