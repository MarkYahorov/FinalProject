package com.example.finalprogect

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class ObserveTask : Fragment() {

    private val args by navArgs<ObserveTaskArgs>()
    private lateinit var deleteBtn: ImageView
    private lateinit var changeBtn: ImageView
    private lateinit var backBtn: ImageView
    private lateinit var taskText: TextView
    private lateinit var mViewModel: TaskViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_observe_task, container, false)
        find(view)
        deleteTask()
        setTaskOnThisScreen()
        updateTask()
        backToMainScreen()
        return view
    }

    private fun setTaskOnThisScreen(){

        taskText.text = args.currentTask.title

    }

    private fun find(view: View) {
        deleteBtn = view.findViewById<ImageView>(R.id.deleteBtn)
        changeBtn = view.findViewById<ImageView>(R.id.updateBtn)
        backBtn = view.findViewById<ImageView>(R.id.backToMainScreen)
        taskText = view.findViewById<TextView>(R.id.textTaskObserve)
    }

    private fun deleteTask(){
        deleteBtn.setOnClickListener {
            mViewModel.deleteTask(args.currentTask)
        }
    }

    private fun updateTask(){
        changeBtn.setOnClickListener {
            findNavController().navigate(R.id.action_observeTask_to_updateTask)
        }
    }

    private fun backToMainScreen(){
        backBtn.setOnClickListener {
            findNavController().navigate(R.id.action_observeTask_to_mainScreen)
        }
    }
}