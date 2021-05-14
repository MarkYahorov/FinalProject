package com.example.finalprogect.presrntation.startScreen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.domain.entities.Task
import com.example.finalprogect.presrntation.mainScreen.MainActivity
import com.example.finalprogect.R
import com.example.finalprogect.TaskViewModel


class ChoosePages : Fragment() {

    private lateinit var createBtn: Button
    private lateinit var textOfTask: TextView
    private lateinit var colvo: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_choose_pages, container, false)
        find(view)
        goToMainScreen()
        return view
    }

    private fun find(view:View){
        createBtn = view.findViewById(R.id.contPages)
        textOfTask = view.findViewById(R.id.meditationSelectText)
        colvo = view.findViewById(R.id.editText)
    }

    private fun goToMainScreen(){
        addTaskToDataBase()
        createBtn.setOnClickListener {
            val intent = Intent(this.context, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun addTaskToDataBase() {

        val thisViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)
        val textTask = textOfTask.text.toString()
        val col = colvo.text.toString()
        var task = Task(0, textTask, 0,0, col, 0,0,0)
        thisViewModel.addTask(task)

    }

}