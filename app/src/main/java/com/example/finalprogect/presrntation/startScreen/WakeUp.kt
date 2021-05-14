package com.example.finalprogect.presrntation.startScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.TimePicker
import androidx.navigation.fragment.findNavController
import com.example.finalprogect.R

class WakeUp : Fragment() {

    private lateinit var btnCont: Button
    private lateinit var timePicker: TimePicker
    private lateinit var questionText : TextView
    private lateinit var backgroundImage: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_wake_up, container, false)
        setAnimation(view)
        backAnimation(view)
        return view
    }

    private fun setAnimation(view:View){
        backgroundImage = view.findViewById(R.id.secondImageScreen)
        questionText = view.findViewById(R.id.secondQuestionScreen)
        timePicker = view.findViewById(R.id.wakeUpTimePicker)
        btnCont = view.findViewById(R.id.continueBtn)
        val anim2 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.text_down)
        val anim = AnimationUtils.loadAnimation(this.requireContext(), R.anim.first_open_prog)
        val anim3 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.btn_up)
        backgroundImage.startAnimation(anim)
        questionText.startAnimation(anim2)
        timePicker.startAnimation(anim3)
        timePicker.setIs24HourView(true)
        timePicker.hour = 7
        timePicker.minute = 30
        btnCont.startAnimation(anim3)
    }

    private fun backAnimation(view: View){
        backgroundImage = view.findViewById(R.id.secondImageScreen)
        questionText = view.findViewById(R.id.secondQuestionScreen)
        timePicker = view.findViewById(R.id.wakeUpTimePicker)
        btnCont = view.findViewById(R.id.continueBtn)
        val anim2 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.text_up)
        val anim = AnimationUtils.loadAnimation(this.requireContext(), R.anim.first_close_prog)
        val anim3 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.btn_down)
        btnCont.setOnClickListener {
            backgroundImage.startAnimation(anim)
            questionText.startAnimation(anim2)
            timePicker.startAnimation(anim3)
            btnCont.startAnimation(anim3)
            android.os.Handler().postDelayed({
                findNavController().navigate(R.id.action_wakeUp_to_goodNightFragment) },
                4500)
        }
    }


}