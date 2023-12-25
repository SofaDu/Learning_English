package com.example.learning_english.quiz

import androidx.compose.runtime.*
import androidx.navigation.NavController


val questionsPerson = listOf(
    Question(
        questionText = "Что означает слово голова на русском языке?",
        correctAnswer = "Head",
        choices = listOf("Head", "Arm", "Leg", "Foot"),
        category = "Person",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What does the word нога mean in English?",
        correctAnswer = "Leg",
        choices = listOf("Arm", "Leg", "Hand", "Chest"),
        category = "Person",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Как называется часть тела, которая соединяет голову и туловище?",
        correctAnswer = "Neck",
        choices = listOf("Neck", "Knee", "Shoulder", "Back"),
        category = "Person",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что означает слово рука на английском языке?",
        correctAnswer = "Arm",
        choices = listOf("Head", "Arm", "Leg", "Foot"),
        category = "Person",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What does the word глаз mean in English?",
        correctAnswer = "Eye",
        choices = listOf("Eye", "Ear", "Nose", "Mouth"),
        category = "Person",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Как называется орган, который помогает нам слышать?",
        correctAnswer = "Ear",
        choices = listOf("Eye", "Ear", "Nose", "Mouth"),
        category = "Person",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что означает слово зубы на английском языке?",
        correctAnswer = "Teeth",
        choices = listOf("Tongue", "Lips", "Chin", "Teeth"),
        category = "Person",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что означает слово рука на английском языке?",
        correctAnswer = "Arm",
        choices = listOf("Head", "Arm", "Leg", "Foot"),
        category = "Person",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что означает слово голова на русском языке?",
        correctAnswer = "Mouth",
        choices = listOf("Lips", "Mouth", "Tongue", "Teeth"),
        category = "Person",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What does the word рот mean in English?",
        correctAnswer = "Leg",
        choices = listOf("Arm", "Leg", "Hand", "Chest"),
        category = "Person",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Как называется часть тела, которая помогает нам стоять и ходить?",
        correctAnswer = "Foot",
        choices = listOf("Knee", "Hand", "Neck", "Foot"),
        category = "Person",
        isCorrectAnswered = false
    ),
    Question(
        questionText = " Как называется часть тела, которая соединяет ноги и туловище?",
        correctAnswer = "Hip",
        choices = listOf("Neck", "Hip", "Leg", "Shoulder"),
        category = "Person",
        isCorrectAnswered = false
    )
)
@Composable
fun QuizPerson(navController: NavController) {

    fun generateRandomQuestions(allQuestions: List<Question>, count: Int): List<Question>
    {
        val personQuestions = allQuestions.filter { it.category == "Person" }
        if(personQuestions.size < count){
            return personQuestions
        }
        return allQuestions.shuffled().take(count)
    }
    val randomPersonQuestions = generateRandomQuestions(questionsPerson, 10)
    QuizApp (questions = randomPersonQuestions, navController = navController)

}