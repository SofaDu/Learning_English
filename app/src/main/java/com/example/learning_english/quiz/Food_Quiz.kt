package com.example.learning_english.quiz

import androidx.compose.runtime.Composable
import androidx.navigation.NavController


val questionsFood = listOf(
    Question(
        questionText = "Как по-английски будет слово кофе?",
        correctAnswer = "Coffee",
        choices = listOf("Coffee", "Tea", "Bread", "Juice"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Как по-английски будет слово чай?",
        correctAnswer = "Tea",
        choices = listOf("Tea", "Water", "Milk", "Beer"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Как по-английски будет слово молоко?",
        correctAnswer = "Milk",
        choices = listOf("Milk", "Lemonade", "Cocoa", "Coke"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "How to translate the word TOMATOES?",
        correctAnswer = "Томаты",
        choices = listOf("Картофель", "Лук", "Томаты", "Чеснок"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "How to translate the word MUSHROOOMS?",
        correctAnswer = "Грибы",
        choices = listOf("Салат", "Виноград", "Банан", "Грибы"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "How to translate the word STRAWBERRIES?",
        correctAnswer = "Клубника",
        choices = listOf("Клубника", "Малина", "Вишня", "Смородина"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Как по-английски будет слово бекон?",
        correctAnswer = "Bacon",
        choices = listOf("Eel", "Chicken", "Bacon", "Sausage"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Как по-английски будет слово горох?",
        correctAnswer = "Pea",
        choices = listOf("Cucumber", "Pea", "Pepper", "Spinach"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Как по-английски будет слово вишня",
        correctAnswer = "Cherry",
        choices = listOf("Cranberry", "Lemon", "Cherry", "Melon"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "How to translate the word LEMON?",
        correctAnswer = "Лимон",
        choices = listOf("Лимон", "Персик", "Лайм", "Грейпфрут"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "How to translate the word MELON?",
        correctAnswer = "Дыня",
        choices = listOf("Кефир", "Молоко", "Арбуз", "Дыня"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "How to translate the word RICE?",
        correctAnswer = "Рис",
        choices = listOf("Макароны", "Гречка", "Рис", "Зерно"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "How to translate the word CREAM?",
        correctAnswer = "Сливки",
        choices = listOf("Ряженка", "Сливки", "Молочный коктель", "Крем"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "How to translate the word CAKE?",
        correctAnswer = "Торт",
        choices = listOf("Кекс", "Печенье", "Торт", "Шоколад"),
        category = "Food",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "How to translate the word HONEY?",
        correctAnswer = "Мед",
        choices = listOf("Варенье", "Мед", "Нуга", "Ириска"),
        category = "Food",
        isCorrectAnswered = false
    )

)

@Composable
fun QuizFood(navController: NavController) {

    fun generateRandomQuestions(allQuestions: List<Question>, count: Int): List<Question>
    {
        val foodQuestion = allQuestions.filter {it.category == "Food" }
        foodQuestion.forEach{question ->
            question.choices = question.choices.shuffled()
        }
        if(foodQuestion.size < count)
            return foodQuestion
        return allQuestions.shuffled().take(count)
    }
        val randomFoodQuestion = generateRandomQuestions(questionsFood, 10)
        QuizApp(questions = randomFoodQuestion, navController = navController)
}




