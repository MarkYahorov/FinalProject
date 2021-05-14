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

class GoodNightFragment : Fragment() {

    private lateinit var btnCont: Button
    private lateinit var timePicker: TimePicker
    private lateinit var questionText: TextView
    private lateinit var backgroundImage: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_good_night, container, false)
        find(view)
        setAnimation()
        backAnimation()
        return view
    }

    private fun setAnimation() {
        val anim2 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.text_down)
        val anim = AnimationUtils.loadAnimation(this.requireContext(), R.anim.first_open_prog)
        val anim3 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.btn_up)
        backgroundImage.startAnimation(anim)
        questionText.startAnimation(anim2)
        timePicker.startAnimation(anim3)
        timePicker.setIs24HourView(true)
        timePicker.hour = 20
        timePicker.minute = 45
        btnCont.startAnimation(anim3)
    }

    private fun backAnimation() {
        val anim2 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.text_up)
        val anim = AnimationUtils.loadAnimation(this.requireContext(), R.anim.first_close_prog)
        val anim3 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.btn_down)
        btnCont.setOnClickListener {
            backgroundImage.startAnimation(anim)
            questionText.startAnimation(anim2)
            timePicker.startAnimation(anim3)
            btnCont.startAnimation(anim3)
            android.os.Handler().postDelayed(
                {
                    findNavController().navigate(R.id.action_goodNightFragment_to_firstQuestionFragment)
                },
                4500
            )
        }
    }

    private fun find(view: View) {

        backgroundImage = view.findViewById(R.id.nightImageScreen)
        questionText = view.findViewById(R.id.thirdQuestionScreen)
        timePicker = view.findViewById(R.id.breakDownTimePicker)
        btnCont = view.findViewById(R.id.continueBtn)

    }

}