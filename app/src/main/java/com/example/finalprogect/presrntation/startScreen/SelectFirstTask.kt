package com.example.finalprogect.presrntation.startScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.finalprogect.R

class SelectFirstTask : Fragment() {

    private lateinit var trainingBtn : ImageButton
    private lateinit var readBtn : ImageButton
    private lateinit var meditationBtn : ImageButton
    private lateinit var drinkBtn : ImageButton
    private lateinit var textQuestion : TextView
    private lateinit var meditationText : TextView
    private lateinit var trainingText : TextView
    private lateinit var drinkText : TextView
    private lateinit var readText : TextView
    private lateinit var backgroundImage : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_select_first_task, container, false)
        find(view)
        animationStart()
        changeViewAndSetAnimation()
        return view
    }

    private fun find(view: View){
        trainingBtn = view.findViewById(R.id.trainingButton)
        readBtn = view.findViewById(R.id.readButton)
        meditationBtn = view.findViewById(R.id.meditationButton)
        drinkBtn = view.findViewById(R.id.drinkButton)
        textQuestion = view.findViewById(R.id.textSelectFragment)
        meditationText = view.findViewById(R.id.meditationText)
        readText = view.findViewById(R.id.readText)
        drinkText = view.findViewById(R.id.drinkText)
        trainingText = view.findViewById(R.id.trainingText)
        backgroundImage = view.findViewById(R.id.backgrImage)
    }

    private fun changeViewAndSetAnimation(){
        trainingBtn.setOnClickListener {
            animationEnd()
            android.os.Handler().postDelayed({
                findNavController().navigate(R.id.action_selectFirstTask_to_chooseTime) },
                4500)
        }
        readBtn.setOnClickListener {
            animationEnd()
            android.os.Handler().postDelayed({
                findNavController().navigate(R.id.action_selectFirstTask_to_choosePages) },
                4500)
        }
        meditationBtn.setOnClickListener {
            animationEnd()
            android.os.Handler().postDelayed({
                findNavController().navigate(R.id.action_selectFirstTask_to_chooseTimeMeditation) },
                4500)
        }
        drinkBtn.setOnClickListener {
            animationEnd()
            android.os.Handler().postDelayed({
                findNavController().navigate(R.id.action_selectFirstTask_to_chooseTimeToDrink) },
                4500)
        }

    }

    private fun animationStart(){
        val anim2 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.text_down)
        val anim = AnimationUtils.loadAnimation(this.requireContext(), R.anim.first_open_prog)
        val anim3 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.btn_up)

        textQuestion.startAnimation(anim2)
        drinkBtn.startAnimation(anim3)
        meditationBtn.startAnimation(anim3)
        readBtn.startAnimation(anim3)
        trainingBtn.startAnimation(anim3)
        trainingText.startAnimation(anim3)
        drinkText.startAnimation(anim3)
        readText.startAnimation(anim3)
        meditationText.startAnimation(anim3)
        backgroundImage.startAnimation(anim)
    }

    private fun animationEnd(){
        val anim2 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.text_up)
        val anim = AnimationUtils.loadAnimation(this.requireContext(), R.anim.first_close_prog)
        val anim3 = AnimationUtils.loadAnimation(this.requireContext(), R.anim.btn_down)

        textQuestion.startAnimation(anim2)
        drinkBtn.startAnimation(anim3)
        meditationBtn.startAnimation(anim3)
        readBtn.startAnimation(anim3)
        trainingBtn.startAnimation(anim3)
        trainingText.startAnimation(anim3)
        drinkText.startAnimation(anim3)
        readText.startAnimation(anim3)
        meditationText.startAnimation(anim3)
        backgroundImage.startAnimation(anim)
    }


}