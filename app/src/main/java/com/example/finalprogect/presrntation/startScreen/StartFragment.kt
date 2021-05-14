package com.example.finalprogect.presrntation.startScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.finalprogect.R

class StartFragment : Fragment() {

    private lateinit var backgroundImage: View
    private lateinit var questionText: TextView
    private lateinit var usualText: TextView
    private lateinit var secondUsualText: TextView
    private lateinit var btnBegin: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)
        setAnimation(view)
        backAnimation(view)
        return view
    }

    private fun setAnimation(view:View){
        backgroundImage = view.findViewById(R.id.background_image)
        questionText = view.findViewById(R.id.start_question)
        usualText = view.findViewById(R.id.textView2)
        secondUsualText = view.findViewById(R.id.textView3)
        btnBegin = view.findViewById(R.id.button2)
        val anim2 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.text_down)
        val anim = AnimationUtils.loadAnimation(this.requireContext(), R.anim.first_open_prog)
        val anim3 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.btn_up)
        backgroundImage.startAnimation(anim)
        questionText.startAnimation(anim2)
        usualText.startAnimation(anim2)
        secondUsualText.startAnimation(anim2)
        btnBegin.startAnimation(anim3)
    }

    private fun backAnimation(view: View){
        backgroundImage = view.findViewById(R.id.background_image)
        questionText = view.findViewById(R.id.start_question)
        usualText = view.findViewById(R.id.textView2)
        secondUsualText = view.findViewById(R.id.textView3)
        btnBegin = view.findViewById(R.id.button2)
        val anim2 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.text_up)
        val anim = AnimationUtils.loadAnimation(this.requireContext(), R.anim.first_close_prog)
        val anim3 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.btn_down)
        btnBegin.setOnClickListener {
            backgroundImage.startAnimation(anim)
            questionText.startAnimation(anim2)
            usualText.startAnimation(anim2)
            secondUsualText.startAnimation(anim2)
            btnBegin.startAnimation(anim3)
            android.os.Handler().postDelayed({
                findNavController().navigate(R.id.action_startFragment_to_wakeUp) },
                4500)
        }
    }





}