package com.example.finalprogect.presrntation.mainScreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.finalprogect.R
import com.example.finalprogect.presrntation.startScreen.StartActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFirstStartScreens()
    }

    private fun setFirstStartScreens(){
        var isFirstTime = true
        if (isFirstTime){
            val intent = Intent(applicationContext, StartActivity::class.java)
            startActivity(intent)
            isFirstTime = false
        }
    }
}