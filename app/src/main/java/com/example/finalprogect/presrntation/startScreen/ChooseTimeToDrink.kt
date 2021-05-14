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
import com.example.finalprogect.R
import com.example.finalprogect.TaskViewModel
import com.example.finalprogect.presrntation.mainScreen.MainActivity

class ChooseTimeToDrink : Fragment() {

    private lateinit var text: TextView
    private lateinit var editText: EditText
    private lateinit var createBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_choose_time_to_drink, container, false)
        find(view)
        goToMainScreen()
        return view
    }

    private fun find(view: View){
        text = view.findViewById(R.id.meditationSelectText)
        editText = view.findViewById(R.id.editTextMeditation)
        createBtn = view.findViewById(R.id.saveThis)
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
        val textTask = text.text.toString()
        val choose = editText.text.toString()
        var task = Task(0, textTask, 0,0, choose, 0,0,0)
        thisViewModel.addTask(task)

    }

}