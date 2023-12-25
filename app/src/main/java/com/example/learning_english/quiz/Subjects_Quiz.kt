package com.example.learning_english.quiz

import androidx.compose.runtime.Composable
import androidx.navigation.NavController


val questionsSubjects = listOf(
    Question(
        questionText = "Как по-английски будет слово кофе?",
        correctAnswer = "Coffee",
        choices = listOf("Coffee", "Tea", "Bread", "Juice"),
        category = "Subject",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Как по-английски будет слово чай?",
        correctAnswer = "Tea",
        choices = listOf("Tea", "Water", "Milk", "Beer"),
        category = "Subject",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Как по-английски будет слово молоко?",
        correctAnswer = "Milk",
        choices = listOf("Milk", "Lemonade", "Cocoa", "Coke"),
        category = "Subject",
        isCorrectAnswered = false
    )
)

@Composable
fun QuizSubject(navController: NavController) {

    fun generateRandomQuestions(allQuestions: List<Question>, count: Int): List<Question>
    {
        val subjectQuestion = allQuestions.filter {it.category == "Food" }
        if(subjectQuestion.size < count)
            return subjectQuestion
        return allQuestions.shuffled().take(count)
    }
    val randomSubjectQuestion = generateRandomQuestions(questionsFood, 10)
    QuizApp(questions = randomSubjectQuestion, navController = navController)
}