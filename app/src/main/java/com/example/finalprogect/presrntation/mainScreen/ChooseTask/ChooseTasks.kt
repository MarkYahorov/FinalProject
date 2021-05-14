package com.example.finalprogect.presrntation.mainScreen.ChooseTask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.finalprogect.R
import com.example.finalprogect.presrntation.mainScreen.AddTask.AddRegularTask

class ChooseTasks : Fragment() {

    private lateinit var regularTask: View
    private lateinit var noRegularTask: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_choose_tasks, container, false)
        find(view)
        regularTask.setOnClickListener {
            findNavController().navigate(R.id.action_chooseTasks_to_addRegularTask)
        }

        noRegularTask.setOnClickListener {
            findNavController().navigate(R.id.action_chooseTasks_to_addSingleTask)
        }
        return view
    }

    private fun find(view: View){
        regularTask = view.findViewById(R.id.regularTask)
        noRegularTask = view.findViewById(R.id.NoRegularTask)
    }



}