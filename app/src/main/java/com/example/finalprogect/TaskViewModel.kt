package com.example.finalprogect

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.Repository
import com.example.domain.entities.Task
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TaskViewModel(private val repository: Repository): ViewModel() {

    private val mTask = MutableLiveData<List<Task>>()
    val liveDataTask: LiveData<List<Task>> = mTask

    fun getAllLiveData(){
        viewModelScope.launch {
            val tasks = repository.getAll()
            mTask.postValue(tasks)
        }
    }

    fun addTask(task: Task){
        viewModelScope.launch {
            repository.addTask(task)
        }
    }

    fun updateTask(task:Task){
        viewModelScope.launch {
            repository.updateTask(task)
        }
    }

    fun deleteTask(task: Task){
        viewModelScope.launch {
            repository.deleteTask(task)
        }
    }

}