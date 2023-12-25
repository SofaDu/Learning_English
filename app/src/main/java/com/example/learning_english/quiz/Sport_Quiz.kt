package com.example.learning_english.quiz

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

val questionsSport = listOf(
    Question(
        questionText = "В каком спорте сражаются два человека в перчатках?",
        correctAnswer = "Boxing",
        choices = listOf("Boxing", "Golf", "Rowing", "Curling"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Как на английском будет дайвинг?",
        correctAnswer = "Diving",
        choices = listOf("Fencing", "Rowing", "Biatlon", "Diving"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Тяжелая атлетика – это",
        correctAnswer = "Weightlifting",
        choices = listOf("Berlin", "Weightlifting", "Badminton,", "Hockey"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is the translation of the word Canoeing?",
        correctAnswer = "Гребля",
        choices = listOf("Альпинизм", "Кёрлинг", "Гребля", "Боулинг"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is the translation of the word Gymnastics?",
        correctAnswer = "Гимнастика",
        choices = listOf("Охота", "Дзюдо", "Гольф", "Гимнастика"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is the translation of the word Hiking?",
        correctAnswer = "Пеший туризм",
        choices = listOf("Хоккей", "Пеший туризм", "Борьба", "Ходьба"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Бег трусцой - это",
        correctAnswer = "Jogging",
        choices = listOf("Jogging", "Kayaking", "Swimming", "Jump"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Гандбол - ",
        correctAnswer = "Handball",
        choices = listOf("Football", "Handball", "Baseball", "Volleyball"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Биатлон - ",
        correctAnswer = "Biathlon",
        choices = listOf("Figure skating", "Luge", "Snowboarding", "Biathlon"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is the translation of the word Chess?",
        correctAnswer = "Шахматы",
        choices = listOf("Шашки", "Шахматы", "Парусный спорт", "Пятиборье"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is the translation of the word Bungee jumping?",
        correctAnswer = "Пряжки с канатом",
        choices = listOf("Пряжки с места", "Пряжки в высоту", "Прыжки с канатом", "Пряжки в длину"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is the translation of the word Squash?",
        correctAnswer = "Гребля",
        choices = listOf("Альпинизм", "Кёрлинг", "Гребля", "Боулинг"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Дартс - ",
        correctAnswer = "Draughts",
        choices = listOf("Golf", "Draughts", "Triathlon", "Skating"),
        category = "Sport",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Карате - ",
        correctAnswer = "Karate",
        choices = listOf("Matrial art", "Wrestling", "Cross", "Karate"),
        category = "Sport",
        isCorrectAnswered = false
    ),Question(
        questionText = "Стрельба - ",
        correctAnswer = "Shooting",
        choices = listOf("Snowboarding", "Shooting", "Lawn tennis", "Roller skating"),
        category = "Sport",
        isCorrectAnswered = false
    )

)

@Composable
fun QuizSport(navController: NavController) {

    fun generateRandomQuestions(allQuestions: List<Question>, count: Int): List<Question>
    {
        val sportQuestions = allQuestions.filter { it.category == "Sport" }
        if(sportQuestions.size < count){
            return sportQuestions
        }

        return allQuestions.shuffled().take(count)
    }

        val randomSportQuestions = generateRandomQuestions(questionsSport, 10)
        QuizApp (questions = randomSportQuestions, navController)

}