package com.example.finalprogect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.entities.Task

class TaskAdapter: RecyclerView.Adapter<TaskAdapter.ViewHolder>() {

    var taskList = emptyList<Task>()

    class ViewHolder(item: View): RecyclerView.ViewHolder(item) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.task_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentTask = taskList[position]
        holder.itemView.findViewById<TextView>(R.id.textOfTaskForRecycler).text = currentTask.title
    }

    override fun getItemCount(): Int = taskList.size

    fun setData(task: List<Task>) {
        this.taskList = task
        notifyDataSetChanged()
    }
}