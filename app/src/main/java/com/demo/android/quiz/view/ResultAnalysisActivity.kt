package com.demo.android.quiz.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import com.example.quizzapp.R
import kotlinx.android.synthetic.main.activity_result_analysis.*

class ResultAnalysisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_analysis)

        val ans = intent.getSerializableExtra(EXTRA_MESSAGE) as ArrayList<String>
        Log.i("all ans:", ans.toString())

        var results: ArrayList<String> = arrayListOf()

        results.add(0, "Choose the Correct option related to Android. \nCorrect answer: Android is an Operating System")

        results.add(1,"Android is -\n" +
                "\n? \nCorrect answer:an operating system")

        results.add(2,"Under which of the following Android is licensed?. \nCorrect answer:  Apache/MIT")

        results.add(3, "For which of the following Android is mainly developed? "+
                "\nCorrect answer:  Mobile devices")

        results.add(4, "Which of the following is the first mobile phone released that ran the Android OS? \n" +
                "\nCorrect answer:  T - Mobile G1.")

        results.add(5, "Which of the following virtual machine is used by the Android operating system?" +
                "\nCorrect answer: Dalvik virtual machine.")

        results.add(6, "APK stands for ?" +
                "\nCorrect answer: Java.")

        results.add(7, "The full form of APK is" +
                "\nCorrect answer: Android Package Kit.")

        results.add(8, "What does API stand for?" +
                "\nCorrect answer: Application Programming Interface")

        results.add(9, "Which of the following converts Java byte code into Dalvik byte code?" +
                "\nCorrect answer: Dex compiler.")

        results.add(10, "How can we stop the services in android? " +
                "\nCorrect answer: By using the stopSelf() and stopService() method.")

        results.add(11, "What is an activity in android?" +
                "\nCorrect answer: A single screen in an application with supporting java code")

        results.add(12, "How can we kill an activity in android?" +
                "\nCorrect answer:  Both (a) and (b).")

        results.add(13, "ADB stands for -" +
                "\nCorrect answer: Android debug bridge.")

        results.add(14, "On which of the following, developers can test the application, during developing the android applications??" +
                "\nCorrect answer: All of the above.")

        var i = 1;
        for (res in results) {
            textView4.append(
                i.toString() +
                        ". " +
                        res.toString() +
                        "\nYour answer: " + ans.get(i-1) +
                        "\n\n"
            )
            i++
        }


    }
}