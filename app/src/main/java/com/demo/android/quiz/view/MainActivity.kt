package com.demo.android.quiz.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.demo.android.quiz.data.Repository
import com.demo.android.quiz.viewModel.MainViewModel
import com.example.quizzapp.R

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy { MainViewModel(Repository()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.prepopulateQuestions()

        fun startPlay(view: View) {
            startActivity(Intent(this, QuestionActivity::class.java))
        }

    }
}
