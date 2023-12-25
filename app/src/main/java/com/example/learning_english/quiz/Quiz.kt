package com.example.learning_english.quiz

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.learning_english.R

data class Question(val questionText: String,
                    val correctAnswer: String,
                    var choices: List<String>,
                    val category: String,
                    var isCorrectAnswered: Boolean)

data class IncorrectQuestion(
    val questionText: String,
    val correctAnswer: String,
    val selectedAnswer: String,
    val choices: List<String>)

val incorrectQuestions: ArrayList<IncorrectQuestion> = ArrayList()

@Composable
fun QuizApp(questions: List<Question>, navController: NavController){
    var currentQuestionIndex by remember { mutableStateOf(0) }
    var isQuizFinished by remember { mutableStateOf(false) }
    var selectedAnswer by remember { mutableStateOf("") }
    var score by remember { mutableStateOf(0) }
    val currentQuestion = questions[currentQuestionIndex]

    Column (modifier =
        Modifier.fillMaxSize()) {
        if (isQuizFinished) {
            QuizResult(score = score, totalQuestions = questions.size,
                navController = navController)
        }
        else {
            QuizQuestion(
                question = currentQuestion,
                selectedAnswer = selectedAnswer,
                onAnswerSelected = { selectedAnswer = it },
                onNextClicked = {
                    if (selectedAnswer.equals(
                            currentQuestion.correctAnswer,
                            ignoreCase = true
                        )
                    ){
                        score++
                        for (question in questions)
                            if (question.questionText == currentQuestion.questionText) {
                                question.isCorrectAnswered = true
                            }
                        }
                    else{
                        incorrectQuestions.add(
                            IncorrectQuestion(currentQuestion.questionText,
                                currentQuestion.correctAnswer, selectedAnswer,
                                currentQuestion.choices))
                    }
                    selectedAnswer = "" ;if (currentQuestionIndex < questions.size-1) { currentQuestionIndex++ }
                else {
                    isQuizFinished = true
                }
            })
        }
    }
}

@Composable
fun QuizQuestion(
    question: Question,
    selectedAnswer: String,
    onAnswerSelected: (String) -> Unit,
    onNextClicked: () -> Unit
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.yellow_1))){
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text(
                text = question.questionText,
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            question.choices.forEach { choice ->
                QuizAnswerChoice(
                    choice = choice,
                    isSelected = choice == selectedAnswer,
                    onAnswerSelected = { onAnswerSelected(choice) })
            }
            Spacer (modifier = Modifier.height(16.dp))
            Button (onClick =
            onNextClicked, modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.blue_1),
                    contentColor = Color.Black
                )) {
                Text(
                    text = "Далее", fontSize = 20.sp
                )
            }
        }
    }
}

@Composable
fun QuizAnswerChoice(choice: String, isSelected: Boolean, onAnswerSelected: () -> Unit) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(4.dp)
        .clickable { onAnswerSelected() }) {
        RadioButton(
            selected = isSelected,
            onClick = null,
            modifier = Modifier.padding(end = 8.dp)
        )
        Text (text = choice, style =
        MaterialTheme.typography.body1)
    }
}

@Composable
fun QuizResult(score: Int, totalQuestions: Int, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Результат викторины",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text (text =
            "Верно решено $score из $totalQuestions",
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(bottom = 16.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            if (incorrectQuestions.size > 0){
                Button(onClick = { navController.navigate("work_mistakes") },
                    modifier = Modifier
                        .width(120.dp)
                        .padding(vertical = 8.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(id = R.color.red_1),
                        contentColor = Color.Black
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = "Ошибки")
                }
            }

            Button(onClick = {  navController.navigate("learn_word") },
                modifier = Modifier
                    .width(120.dp)
                    .padding(vertical = 8.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.blue_1),
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(8.dp)) {
                Text(
                    text = "Назад"
                )
            }
        }
    }
}

@Composable
fun WorkMistakes(navController: NavController, incorrectQuestions: ArrayList<IncorrectQuestion>){
    Box(
        Modifier
            .fillMaxSize()
            .background(colorResource(R.color.yellow_1))) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(7.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            incorrectQuestions.forEach{incorrectQuestion ->
                Text(
                    text = incorrectQuestion.questionText,
                    Modifier.wrapContentSize(),
                    textAlign = TextAlign.Start,
                    fontSize = 25.sp
                )
                Spacer(modifier = Modifier.padding(2.dp))
                incorrectQuestion.choices.forEach { choice ->
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .height(25.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start) {
                        when (choice) {
                            incorrectQuestion.selectedAnswer ->
                                Image(painterResource(R.drawable.incorrect_answer),
                                "", Modifier.size(12.dp))
                            incorrectQuestion.correctAnswer ->
                                Image(painterResource(R.drawable.check_answer),
                                "", Modifier.size(12.dp))
                            else -> Image(painterResource(R.drawable.radio_button),
                                "", Modifier.size(12.dp))
                        }
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(text = choice,
                        fontSize = 20.sp)
                    }
                }
                Spacer(Modifier.height(5.dp))
            }
            Button(onClick = {
                incorrectQuestions.removeAll(incorrectQuestions.toSet())
                navController.navigate("learn_word") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.blue_1),
                    contentColor = Color.Black),
            shape = RoundedCornerShape(8.dp)) {
                Text(
                    text = "Назад"
                )
            }
        }
    }
}



@Composable
fun App(questions: List<Question>) {

    var progress = 0
    for (question in questions)
        if (question.isCorrectAnswered)
            progress++
    val result = String.format("%.0f", progress.toFloat()/questions.size.toFloat()*100)
    Column(Modifier.padding(16.dp)) {
        Text("$result%",
        fontSize = 16.sp)
    }
}

@Composable
fun FullApp(){

    val allQuestion: List<Question> =
                questionsFood +
                questionsPerson +
                questionsSport +
                questionsSubjects +
                questionsFamily +
                questionsClothes +
                questionsAnimals

    var progress = 0
    val all = 300
    for (question in allQuestion)
        if (question.isCorrectAnswered)
            progress++
    val result = String.format("%.0f", progress.toFloat()/all.toFloat()*100)
    Column(Modifier.padding(16.dp)) {
        Text("Решено: $result%",
        fontSize = 20.sp)
    }

}
