package com.example.finalprogect

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.domain.entities.Task

class UpdateTask : Fragment() {

    private val args by navArgs<ObserveTaskArgs>()
    private lateinit var closeBtn: ImageView
    private lateinit var saveBtn: TextView
    private lateinit var textOfTask: EditText
    private lateinit var imageTask: ImageView
    private lateinit var checkBox: CheckBox
    private lateinit var reputeBtn: Button
    private lateinit var timeBtn: Button
    private lateinit var numberOrTimeText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_update_task, container, false)
        find(view)
        backToObserveScreen()
        saveBtn.setOnClickListener {
            updateTask()
        }
        return view
    }

    private fun find(view: View){
        closeBtn = view.findViewById(R.id.closeUpdateTask)
        saveBtn = view.findViewById(R.id.saveBtnUpdate)
        textOfTask = view.findViewById(R.id.nameTaskUpdate)
        numberOrTimeText = view.findViewById(R.id.numberOrTimeTextUpdate)
    }

    private fun backToObserveScreen(){
        closeBtn.setOnClickListener {
            findNavController().navigate(R.id.action_updateTask_to_observeTask)
        }
    }

    private fun updateTask(){
        val textUpdateTask = textOfTask.text.toString()
        val numberOrTimeTextUpdateTask = numberOrTimeText.text.toString()
        val updateTask = Task(args.currentTask.id, textUpdateTask,0,0,numberOrTimeTextUpdateTask,0,0,0)
    }

}