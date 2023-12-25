package com.example.learning_english.quiz

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

val questionsAnimals = listOf(
    Question(
        questionText = "What is a kangaroo?",
        correctAnswer = "Кенгуру",
        choices = listOf("Крокодил", "Жираф", "Кенгуру", "Лев"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a panda?",
        correctAnswer = "Панда",
        choices = listOf("Панда", "Слон", "Обезьяна", "Змея"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a cheetah?",
        correctAnswer = "Гепард",
        choices = listOf("Тигр", "Заяц", "Волк", "Гепард"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a dolphin?",
        correctAnswer = "Дельфин",
        choices = listOf("Морж", "Медуза", "Акула", "Дельфин"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a giraffe?",
        correctAnswer = "Жираф",
        choices = listOf("Лошадь", "Слон", "Жираф", "Зебра"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a koala?",
        correctAnswer = "Коала",
        choices = listOf("Коала", "Крокодил", "Жираф", "Обезьяна"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a penguin?",
        correctAnswer = "Пингвин",
        choices = listOf("Медведь", "Пингвин", "Змея", "Лев"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a turtle?",
        correctAnswer = "Черепаха",
        choices = listOf("Кенгуру", "Жираф", "Слон", "Черепаха"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a polar bear?",
        correctAnswer = "Медведь",
        choices = listOf("Волк", "Тигр", "Медведь", "Панда"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a eagle?",
        correctAnswer = "Орел",
        choices = listOf("Орел", "Кенгуру", "Обезьяна", "Лев"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a crocodile?",
        correctAnswer = "Крокодил",
        choices = listOf("Акула", "Жираф", "Крокодил", "Заяц"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a elephant?",
        correctAnswer = "Слон",
        choices = listOf("Лошадь", "Слон", "Зебра", "Морж"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a lion?",
        correctAnswer = "Лев",
        choices = listOf("Пингвин", "Медведь", "Лев", "Змея"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a snake?",
        correctAnswer = "Змея",
        choices = listOf("Орел", "Крокодил", "Змея", "Тигр"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "What is a zebra?",
        correctAnswer = "Зебра",
        choices = listOf("Жираф", "Зебра", "Обезьяна", "Лев"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое слон?",
        correctAnswer = "Elephant",
        choices = listOf("Elephant", "Tiger", "Monkey", "Zebra"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое пингвин?",
        correctAnswer = "Penguin",
        choices = listOf("Elephant", "Penguin", "Lion", "Crocodile"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое тигр?",
        correctAnswer = "Tiger",
        choices = listOf("Giraffe", "Turtle", "Tiger", "Panda"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое медведь?",
        correctAnswer = "Bear",
        choices = listOf("Bear", "Snake", "Dolphin", "Koala"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое лошадь?",
        correctAnswer = "Horse",
        choices = listOf("Elephant", "Horse", "Cheetah", "Kangaroo"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое обезьяна?",
        correctAnswer = "Monkey",
        choices = listOf("Monkey", "Zebra", "Elephant", "Polar Bear"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое лев?",
        correctAnswer = "Lion",
        choices = listOf("Lion", "Dolphin", "Penguin", "Giraffe"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое жираф?",
        correctAnswer = "Giraffe",
        choices = listOf("Elephant", "Giraffe", "Zebra", "Koala"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое кенгуру?",
        correctAnswer = "Kangaroo",
        choices = listOf("Elephant", "Kangaroo", "Turtle", "Panda"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое акула?",
        correctAnswer = "Shark",
        choices = listOf("Elephant", "Snake", "Shark", "Monkey"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое крокодил?",
        correctAnswer = "Crocodile",
        choices = listOf("Lion", "Crocodile", "Zebra", "Penguin"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое дельфин?",
        correctAnswer = "Dolphin",
        choices = listOf("Elephant", "Dolphin", "Tiger", "Bear"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое панда?",
        correctAnswer = "Panda",
        choices = listOf("Elephant", "Panda", "Monkey", "Snake"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое орел?",
        correctAnswer = "Eagle",
        choices = listOf("Elephant", "Lion", "Eagle", "Turtle"),
        category = "Animals",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Что такое черепаха?",
        correctAnswer = "Turtle",
        choices = listOf("Elephant", "Tiger", "Turtle", "Bear"),
        category = "Animals",
        isCorrectAnswered = false
    )
)


@Composable
fun QuizAnimals(navController: NavController) {

    fun generateRandomQuestions(allQuestions: List<Question>, count: Int): List<Question>
    {
        val animalsQuestion = allQuestions.filter {it.category == "Animals" }
        animalsQuestion.forEach{question ->
            question.choices = question.choices.shuffled()
        }
        if(animalsQuestion.size < count)
            return animalsQuestion
        return allQuestions.shuffled().take(count)
    }
    val randomAnimalsQuestion = generateRandomQuestions(questionsAnimals, 10)
    QuizApp(questions = randomAnimalsQuestion, navController = navController)
}