package com.example.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.data.entities_db.TaskDB
import com.example.domain.entities.Task

@Dao
interface TaskDao {

    @Insert()
    suspend fun addTask(task: TaskDB)

    @Query("SELECT * FROM task_table ORDER BY id ASC")
    suspend fun getAll(): List<TaskDB>

    @Update
    suspend fun updateTask(task: TaskDB)

    @Delete
    suspend fun deleteTask(task: TaskDB)

    @Query("DELETE FROM task_table")
    suspend fun deleteAllTasks()
}