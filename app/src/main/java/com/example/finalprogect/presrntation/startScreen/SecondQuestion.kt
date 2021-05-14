package com.example.finalprogect.presrntation.startScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.finalprogect.R

class SecondQuestion : Fragment() {

    private lateinit var firstBtn: TextView
    private lateinit var secBtn: TextView
    private lateinit var thirdBtn: TextView
    private lateinit var questionText: TextView
    private lateinit var firstBtnImage: View
    private lateinit var secBtnImage: View
    private lateinit var thirdBtnImage: View
    private lateinit var backgroundImage: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second_question, container, false)
        find(view)
        startAnimation()
        clickButton()
        return view
    }

    private fun find(view: View) {
        questionText = view.findViewById(R.id.questionOfSecQuFragm)
        firstBtnImage = view.findViewById(R.id.first_container_btn)
        secBtnImage = view.findViewById(R.id.sec_container_btn)
        thirdBtnImage = view.findViewById(R.id.third_container_btn)
        backgroundImage = view.findViewById(R.id.backgrIm)
        firstBtn = view.findViewById(R.id.first_answer)
        secBtn = view.findViewById(R.id.sec_answer)
        thirdBtn = view.findViewById(R.id.third_answer)
    }

    private fun startAnimation() {
        val anim2 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.text_down)
        val anim = AnimationUtils.loadAnimation(this.requireContext(), R.anim.first_open_prog)
        val anim3 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.btn_up)

        backgroundImage.startAnimation(anim)
        questionText.startAnimation(anim2)
        firstBtn.startAnimation(anim3)
        secBtn.startAnimation(anim3)
        thirdBtn.startAnimation(anim3)
        firstBtnImage.startAnimation(anim3)
        secBtnImage.startAnimation(anim3)
        thirdBtnImage.startAnimation(anim3)
    }

    private fun clickButton() {
        firstBtnImage.setOnClickListener {
            backAnimation()
            android.os.Handler().postDelayed(
                {
                    findNavController().navigate(R.id.action_secondQuestion_to_thirdQuestion)
                },
                4500
            )
        }
        secBtnImage.setOnClickListener {
            backAnimation()
            android.os.Handler().postDelayed(
                {
                    findNavController().navigate(R.id.action_secondQuestion_to_thirdQuestion)
                },
                4500
            )
        }
        thirdBtnImage.setOnClickListener {
            backAnimation()
            android.os.Handler().postDelayed(
                {
                    findNavController().navigate(R.id.action_secondQuestion_to_thirdQuestion)
                },
                4500
            )
        }
    }

    private fun backAnimation() {

        val anim2 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.text_up)
        val anim = AnimationUtils.loadAnimation(this.requireContext(), R.anim.first_close_prog)
        val anim3 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.btn_down)

        backgroundImage.startAnimation(anim)
        questionText.startAnimation(anim2)
        firstBtn.startAnimation(anim3)
        secBtn.startAnimation(anim3)
        thirdBtn.startAnimation(anim3)
        firstBtnImage.startAnimation(anim3)
        secBtnImage.startAnimation(anim3)
        thirdBtnImage.startAnimation(anim3)

    }
}