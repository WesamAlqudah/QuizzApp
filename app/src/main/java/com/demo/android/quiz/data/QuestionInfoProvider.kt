package com.demo.android.quiz.data

import com.demo.android.quiz.data.model.Answer
import com.demo.android.quiz.data.model.Question

class QuestionInfoProvider {

    var questionList = initQuestionList()
    var answerList = initAnswersList()

    private fun initQuestionList(): MutableList<Question>{
        val questions = mutableListOf<Question>()
        questions.add(
            Question(1, "1. Android is .")
        )
        questions.add(
            Question(2, "2. Under which of the following Android is licensed?")
        )
        questions.add(
            Question(3, "3. For which of the following Android is mainly developed?")
        )
        questions.add(
            Question(4, "4. Which of the following is the first mobile phone released that ran the Android OS?")
        )
        questions.add(
            Question(5, "5. Which of the following virtual machine is used by the Android operating system?")
        )
        questions.add(
            Question(6, "6. Android is based on which of the following language?")
        )
        questions.add(
            Question(7, "7. APK stands for -")
        )
        questions.add(
            Question(8, "8. Which of the following converts Java byte code into Dalvik byte code?")
        )
        questions.add(
            Question(9, "9. Which of the following converts Java byte code into Dalvik byte code?")
        )
        questions.add(
            Question(10, "10. How can we stop the services in android?")
        )
        questions.add(
            Question(11, "11. What is an activity in android?")
        )
        questions.add(
            Question(12, "12. How can we kill an activity in android?")
        )
        questions.add(
            Question(13, "13. ADB stands for -")
        )
        questions.add(
            Question(14, "14. On which of the following, developers can test the application, during developing the android applications?")
        )
        questions.add(
            Question(15, "15. Which of the following kernel is used in Android?")
        )
        return questions
    }

    private fun initAnswersList(): MutableList<Answer>{
        val answers = mutableListOf<Answer>()
//        https://www.javatpoint.com/android-mcq
        answers.add(Answer(1, 1, true, "an operating system"))
        answers.add(Answer(2, 1, true, "Apache/MIT"))
        answers.add(Answer(3, 1, false, "Laptops"))
        answers.add(Answer(4, 1, true, "T - Mobile G1"))

        answers.add(Answer(5, 2, true, "Dalvik virtual machine"))
        answers.add(Answer(6, 2, true, "Java"))
        answers.add(Answer(7, 2, true, "Android Package Kit"))
        answers.add(Answer(8, 2, false, "Application Page Interface"))

        answers.add(Answer(9, 3, false, "Mobile interpretive compiler (MIC)"))
        answers.add(Answer(10, 3, true, "Android Debug Bridge"))
        answers.add(Answer(11, 3, false, "Android Destroy Bridge"))
        answers.add(Answer(12, 3, false, "Android Developed Bridge"))

        answers.add(Answer(13, 4, false, "Networking"))
        answers.add(Answer(14, 4, false, "Portability"))
        answers.add(Answer(15, 4, false, "Security"))
        answers.add(Answer(16, 4, true, "All"))

        answers.add(Answer(17, 5, true, "Dalvik operating system"))
        answers.add(Answer(18, 5, false, "JVM"))
        answers.add(Answer(19, 5, false, "Simple virtual machine"))
        answers.add(Answer(20, 5, false, "None"))

        answers.add(Answer(21, 6, false, "Python"))
        answers.add(Answer(22, 6,false, "C++"))
        answers.add(Answer(23, 6, true, "Java"))
        answers.add(Answer(24, 6, false, "None"))

        answers.add(Answer(25, 7, false, "android.widget"))
        answers.add(Answer(26, 7, false, "android.view.View"))
        answers.add(Answer(27, 7, true, "android.view.ViewGroup"))
        answers.add(Answer(28, 7, false, "None"))

        answers.add(Answer(29, 8, false, "Android Page Kit"))
        answers.add(Answer(30, 8, false, "Android Phone Kit"))
        answers.add(Answer(31, 8, true, "Android Package Kit"))
        answers.add(Answer(32, 8, false, "Android Photo Kit"))

        answers.add(Answer(33, 9, false, "It has information about layout in an application"))
        answers.add(Answer(34, 9, true, " It has all the information about an application"))
        answers.add(Answer(35, 9, false, "It has the information about activities in an application"))
        answers.add(Answer(36, 9, false, "None"))

        answers.add(Answer(37, 10, false, "For sharing the data between applications"))
        answers.add(Answer(38, 10, false, "For storing the data in the database"))
        answers.add(Answer(39, 10, true, "For sending the data from an application to another application"))
        answers.add(Answer(40, 10, false, "None of the above"))

        answers.add(Answer(41, 11, false, "Emulators in Android SDK"))
        answers.add(Answer(42, 11, false, "Android Phone"))
        answers.add(Answer(43, 11, false, "Third-Party Emulator"))
        answers.add(Answer(44, 11, true, "All the above"))

        answers.add(Answer(45, 12, false, "Adapter"))
        answers.add(Answer(46, 12, false, "Activity"))
        answers.add(Answer(47, 12, true, "Fragments"))
        answers.add(Answer(48, 12, false, "None"))

        answers.add(Answer(49, 13, true, "dex compiler"))
        answers.add(Answer(50, 13, false, "Mobile interpretive compare"))
        answers.add(Answer(51, 13, false, "Dalvik converter"))
        answers.add(Answer(52, 13, false, "None"))

        answers.add(Answer(53, 14, false, "system. exit()  method"))
        answers.add(Answer(54, 14, true, "stopSelf() and stopService() method"))
        answers.add(Answer(55, 14, false, "finish() method"))
        answers.add(Answer(56, 14, false, "end() method"))

        answers.add(Answer(57, 15, false, "finishActivity (int requestCode)"))
        answers.add(Answer(58, 15, false, "finish() method"))
        answers.add(Answer(59, 15, false, "neither a and b"))
        answers.add(Answer(60, 15, true, "Both"))

        return answers
    }

}