package com.example.finalprogect.presrntation.mainScreen.AddTask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalprogect.R
import com.example.finalprogect.TaskAdapter
import com.example.finalprogect.TaskViewModel

class MainScreen : Fragment() {

    private lateinit var addBtn: Button
    private lateinit var taskRecycler: RecyclerView
    private lateinit var mTaskViewModel: TaskViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main_screen, container, false)
        find(view)
        addBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainScreen_to_chooseTasks)
        }
        addRecycler()
        return view
    }

    private fun find(view: View){
        addBtn = view.findViewById(R.id.add_btn)
        taskRecycler = view.findViewById(R.id.mainRecycler)
    }

    private fun addRecycler(){

        mTaskViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)
        mTaskViewModel.getAllLiveData()
        mTaskViewModel.liveDataTask.observe(viewLifecycleOwner, {
            with(taskRecycler) {
                layoutManager = LinearLayoutManager(
                    requireContext()
                )
                adapter = TaskAdapter()
                hasFixedSize()
            }
        })
    }




}