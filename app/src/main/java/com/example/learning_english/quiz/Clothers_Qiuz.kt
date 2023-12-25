package com.example.learning_english.quiz

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

val questionsClothes = listOf(
    Question(
        questionText = "What is a T-shirt?",
        correctAnswer = "Футболка",
        choices = listOf("Футболка", "Кофта", "Брюки", "Платье"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a hoodie?",
        correctAnswer = "Худи",
        choices = listOf("Шорты", "Рубашка", "Куртка", "Худи"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a scarf?",
        correctAnswer = "Шарф",
        choices = listOf("Шарф", "Платье", "Перчатки", "Кофта"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a skirt?",
        correctAnswer = "Юбка",
        choices = listOf("Платье", "Джинсы", "Юбка", "Костюм"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a blouse?",
        correctAnswer = "Блузка",
        choices = listOf("Брюки", "Шапка", "Пальто", "Блузка"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a suit?",
        correctAnswer = "Костюм",
        choices = listOf("Футболка", "Туника", "Штаны", "Костюм"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a dress?",
        correctAnswer = "Платье",
        choices = listOf("Пиджак", "Куртка", "Платье", "Рубашка"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a jacket?",
        correctAnswer = "Куртка",
        choices = listOf("Шляпа", "Куртка", "Шарф", "Перчатки"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What are jeans?",
        correctAnswer = "Джинсы",
        choices = listOf("Юбка", "Туфли", "Джинсы", "Пальто"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a belt?",
        correctAnswer = "Ремень",
        choices = listOf("Халат", "Штаны", "Свитер", "Ремень"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What are sneakers?",
        correctAnswer = "Кроссовки",
        choices = listOf("Сапоги", "Туфли", "Сандалии", "Кроссовки"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a hat?",
        correctAnswer = "Шляпа",
        choices = listOf("Шуба", "Шляпа", "Юбка", "Шарф"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a swimsuit?",
        correctAnswer = "Купальник",
        choices = listOf("Купальник", "Фартук", "Брюки", "Кофта"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What are gloves?",
        correctAnswer = "Перчатки",
        choices = listOf("Перчатки", "Футболка", "Шорты", "Пиджак"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a coat?",
        correctAnswer = "Пальто",
        choices = listOf("Штаны", "Куртка", "Пальто", "Пиджак"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Футболка - это",
        correctAnswer = "T-shirt",
        choices = listOf("Blouse", "Jacket", "T-shirt", "Skirt"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Шапка - это",
        correctAnswer = "Hat",
        choices = listOf("Shoes", "Hat", "Socks", "Pants"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Платье - это",
        correctAnswer = "Dress",
        choices = listOf("Coat", "Sweater", "Scarf", "Dress"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Куртка - это",
        correctAnswer = "Jacket",
        choices = listOf("Jacket", "Trousers", "Gloves", "Belt"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Брюки - это",
        correctAnswer = "Pants",
        choices = listOf("Blouse", "Shirt", "Pants", "Skirt"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Сапоги - это",
        correctAnswer = "",
        choices = listOf("Sandals", "Sneakers", "Slippers", "Boots"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Шарф - это",
        correctAnswer = "Scarf",
        choices = listOf("Coat", "Scarf", "Hat", "Gloves"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Рубашка - это",
        correctAnswer = "Shirt",
        choices = listOf("Trousers", "Dress", "Sweater", "Shirt"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Юбка - это",
        correctAnswer = "Skirt",
        choices = listOf("Skirt", "Pants", "Coat", "Jacket"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Пиджак - это",
        correctAnswer = "Jacket",
        choices = listOf("Hat", "Jacket", "Sweater", "Blouse"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Кофта - это",
        correctAnswer = "Sweater",
        choices = listOf("Coat", "Shoes", "Trousers", "Sweater"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Джинсы - это",
        correctAnswer = "Jeans",
        choices = listOf("Skirt", "Gloves", "Jeans", "Shorts"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Туфли - это",
        correctAnswer = "Shoes",
        choices = listOf("Sandals", "Shoes", "Boots", "Sneakers"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Перчатки - это",
        correctAnswer = "Gloves",
        choices = listOf("Gloves", "Socks", "Hat", "Scarf"),
        category = "Clothe",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Пижама - это",
        correctAnswer = "Pajamas",
        choices = listOf("Sweater", "Coat", "Jacket", "Pajamas"),
        category = "Clothe",
        isCorrectAnswered = false
    )
)

@Composable
fun QuizClothes(navController: NavController) {

    fun generateRandomQuestions(allQuestions: List<Question>, count: Int): List<Question>
    {
        val clotheQuestion = allQuestions.filter {it.category == "Clothe" }
        clotheQuestion.forEach{question ->
            question.choices = question.choices.shuffled()
        }
        if(clotheQuestion.size < count)
            return clotheQuestion
        return allQuestions.shuffled().take(count)
    }
    val randomClotheQuestion = generateRandomQuestions(questionsClothes, 10)
    QuizApp(questions = randomClotheQuestion, navController = navController)
}