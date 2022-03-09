package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var question1 = QuestionData(
                "On what continent is Bangladesh located?",
                1,
                "South America",
                "North America",
                "Asia",
                "Africa",
                3
        )
        var question2 = QuestionData(
                "By what name was Bangladesh known in the 1500s?",
                1,
                "Bengal",
                "India",
                "Portugal",
                "China",
                1
        )
        var question3 = QuestionData(
                "What export was known to come from Bangladesh during the 1500s?",
                1,
                "Coffee",
                "Tea",
                "Cocoa",
                "Hemp",
                2
        )
        var question4 = QuestionData(
                "Texas was part of what country before joining the United States?",
                1,
                "Spain",
                "Mexico",
                "France",
                "Portugal",
                2
        )
        var question5 = QuestionData(
                "Where did the first known democracy start?",
                1,
                "Africa",
                "Atlanta",
                "Athena",
                "Athens",
                4
        )
        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}