package com.example.finalprogect.presrntation.mainScreen.AddTask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.example.domain.entities.Task
import com.example.finalprogect.R
import com.example.finalprogect.TaskViewModel

class AddRegularTask : Fragment() {

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
        val view = inflater.inflate(R.layout.fragment_add_regular_task, container, false)
        find(view)
        pushCheckBox()
        addTaskToDataBase()
        return view
    }

    private fun find(view: View) {

        saveBtn = view.findViewById(R.id.saveBtn)
        textOfTask = view.findViewById(R.id.nameTaskUpdate)
        imageTask = view.findViewById(R.id.imageTask)
        checkBox = view.findViewById(R.id.checkBoxUpdate)
        reputeBtn = view.findViewById(R.id.repUpdate)
        timeBtn = view.findViewById(R.id.timeUpdate)
        numberOrTimeText = view.findViewById(R.id.numberOrTimeTextUpdate)

    }

    private fun pushCheckBox(){

        checkBox.setOnClickListener {
            if (checkBox.isChecked) {
                reputeBtn.isVisible = true
                timeBtn.isVisible = true
                numberOrTimeText.isVisible = true
            }
        }

    }

    private fun addTaskToDataBase() {

        val thisViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)
        val textTask = textOfTask.text.toString()
        val image = imageTask.imageAlpha
        var task = Task(0, textTask, image,0, null, 0,0,0)
        if (checkBox.isChecked) {
            val numberOrTime = numberOrTimeText.text.toString()
            task = Task(0, textTask, image, 0, numberOrTime,  0, 0, 0)
        }
        thisViewModel.addTask(task)

    }


}