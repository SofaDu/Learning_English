package com.example.learning_english.quiz

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

val questionsFamily = listOf(
    Question(
        questionText = "Brother - ",
        correctAnswer = "Брат",
        choices = listOf("Сестра", "Брат", "Отец", "Дочь"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Grandmother - ",
        correctAnswer = "Бабушка",
        choices = listOf("Бабушка", "Тетя", "Отец", "Дочь"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Nephew - ",
        correctAnswer = "Племянник",
        choices = listOf("Брат", "Племянник", "Муж", "Дочь"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Cousin - ",
        correctAnswer = "Двоюродный брат/сестра",
        choices = listOf("Племянник/племянница", "Бабушка/дедушка", "Дядя/тетя", "Двоюродный брат/сестра"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Husband - ",
        correctAnswer = "Муж",
        choices = listOf("Жена", "Сын", "Муж", "Дочь"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Sister - ",
        correctAnswer = "Сестра",
        choices = listOf("Сестра", "Брат", "Отец", "Дочь"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Father - ",
        correctAnswer = "Отец",
        choices = listOf("Дедушка", "Тетя", "Отец", "Сын"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Wife - ",
        correctAnswer = "Жена",
        choices = listOf("Сын", "Жена", "Муж", "Дочь"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Uncle - ",
        correctAnswer = "Двоюродный брат/сестра",
        choices = listOf("Племянник", "Бабушка", "Дядя", "Двоюродный брат"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Mother - ",
        correctAnswer = "Мать",
        choices = listOf("Мать", "Сын", "Отец", "Дочь"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Daughter - ",
        correctAnswer = "Дочь",
        choices = listOf("Сестра", "Брат", "Отец", "Дочь"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Grandfather - ",
        correctAnswer = "Дедушка",
        choices = listOf("Дедушка", "Сын", "Отец", "Брат"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Aunt - ",
        correctAnswer = "Тетя",
        choices = listOf("Племянница", "Тетя", "Двоюродная сестра", "Мать"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Son - ",
        correctAnswer = "Сын",
        choices = listOf("Сын", "Муж", "Дядя", "Двоюродная сестра"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Grandchildren - ",
        correctAnswer = "Внучата",
        choices = listOf("Внук", "Внучата", "Внучка", "Дочь"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Мачеха  - ",
        correctAnswer = "Дочь",
        choices = listOf("Сестра", "Брат", "Отец", "Дочь"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Падчерица - ",
        correctAnswer = "Stepdaughter ",
        choices = listOf("Stepbrother", "Stepson", "Stepdaughter ", "Stepsister"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Сводная сестра - ",
        correctAnswer = "Stepsister",
        choices = listOf("Spouse", "Niece", "Stepsister", "Aunt"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Сводный брат - ",
        correctAnswer = "stepbrother ",
        choices = listOf("Grandson", "stepbrother", "Son", "Brother"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Сестра по одному из родителейn - ",
        correctAnswer = "Half—sister",
        choices = listOf("In-laws", "Half—sister", "Wife", "Siblings"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Племянница - ",
        correctAnswer = "Niece",
        choices = listOf("Niece", "Nephew", "Uncle", "Aunt"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Молодой человек - ",
        correctAnswer = "Boyfriend ",
        choices = listOf("Bridegroom", "Single", "Boyfriend ", "Spouse"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Девушка - ",
        correctAnswer = "Тетя",
        choices = listOf("Girlfriend", "Bride ", "Single", "Wife"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Шведская семья - ",
        correctAnswer = "Sambo",
        choices = listOf("Sambo", "Spouse", "Single", "Bride"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Младенец - ",
        correctAnswer = "Baby",
        choices = listOf("Baby", "Children", "Grandchildren", "Daughter"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Правнук - ",
        correctAnswer = "Great-grandson",
        choices = listOf("Great-grandsonce", "Great-granddaughter", "Great-great-grandmother", "Grandson"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Правнучка - ",
        correctAnswer = "Great-granddaughter",
        choices = listOf("Grandson", "Great-granddaughter", "Great-great-grandmother", "Great-grandson"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Свекровь/теща - ",
        correctAnswer = "Mother-in-law",
        choices = listOf("Mother-in-law", "Brother-in-law", "Sister-in-law", "Son-in-law"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Тесть/свекор - ",
        correctAnswer = "Father-in-law",
        choices = listOf("Brother-in-law", "Father-in-law", "Son-in-law", "Niece"),
        category = "Family",
        isCorrectAnswered = false
    ),
    Question(
        questionText = "Золовка/свояченица - ",
        correctAnswer = "Sister-in-law",
        choices = listOf("Mother-in-law", "Brother-in-law", "Sister-in-law", "Son-in-law"),
        category = "Family",
        isCorrectAnswered = false
    )

)

@Composable
fun QuizFamily(navController: NavController) {

    fun generateRandomQuestions(allQuestions: List<Question>, count: Int): List<Question>
    {
        val familyQuestion = allQuestions.filter {it.category == "Family" }
        if(familyQuestion.size < count)
            return familyQuestion
        return allQuestions.shuffled().take(count)
    }
    val randomFamilyQuestion = generateRandomQuestions(questionsFamily, 10)
    QuizApp(questions = randomFamilyQuestion, navController = navController)
}