package com.demo.android.quiz.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val waitHandler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        waitHandler.postDelayed(Runnable {
            try {

                startActivity(Intent(this, MainActivity::class.java))

                finish()
            } catch (ignored: Exception) {
                ignored.printStackTrace()
            }
        }, 2000)

    }

    override fun onDestroy() {
        super.onDestroy()
        waitHandler.removeCallbacksAndMessages(null)
    }

}
