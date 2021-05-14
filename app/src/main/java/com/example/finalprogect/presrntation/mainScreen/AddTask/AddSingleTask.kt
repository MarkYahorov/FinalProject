package com.example.finalprogect.presrntation.mainScreen.AddTask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.example.domain.entities.Task
import com.example.finalprogect.R
import com.example.finalprogect.TaskViewModel


class AddSingleTask : Fragment() {

    private lateinit var saveBtn: Button
    private lateinit var editTask: EditText


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_single_task, container, false)
        find(view)

        return view
    }

    private fun find(view: View){
        saveBtn = view.findViewById(R.id.saveTask)
        editTask = view.findViewById(R.id.textTaskNoRegular)
    }

    private fun addNoRegularTaskToDataBase(){
        saveBtn.setOnClickListener {
            val viewModel = ViewModelProvider(this).get(TaskViewModel::class.java)
            val textOfTask = editTask.text.toString()
            val task = Task(0, textOfTask, 0, 0, null, 0, 0, 0)
        }
    }

}