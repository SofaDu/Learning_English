@file:Suppress("UNCHECKED_CAST")

package com.example.learning_english

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.learning_english.quiz.*
import java.io.File


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            var name by remember {
                mutableStateOf("")
            }
            NavHost(navController, "authorization") {
                composable("authorization") {
                    Authorization(navController)
                }
                composable(
                    "learn_word/{username}",
                    arguments = listOf(navArgument("username") { type = NavType.StringType })
                ) { username ->
                    username.arguments?.getString("username")
                        ?.let {
                            name = it
                            Learn_Word(navController, it)
                        }
                }
                composable("learn_word") {
                    Learn_Word(navController, name)
                }
                composable("person") {
                    QuizPerson(navController)
                }
                composable("sports") {
                    QuizSport(navController)
                }
                composable("food_drink") {
                    QuizFood(navController)
                }
                composable("subjects") {
                    QuizSubject(navController)
                }
                composable("family"){
                    QuizFamily(navController)
                }
                composable("clothes"){
                    QuizClothes(navController)
                }
                composable("work_mistakes"){
                    WorkMistakes(navController, incorrectQuestions)
                }
                composable("animals"){
                    QuizAnimals(navController)
                }
            }
        }

    }

    override fun onPause() {
        super.onPause()

        var data = ""
        questionsAnimals.forEach {
            data += it.isCorrectAnswered.toString() + "/"
        }
        questionsClothes.forEach {
            data += it.isCorrectAnswered.toString() + "/"
        }
        questionsFamily.forEach {
            data += it.isCorrectAnswered.toString() + "/"
        }
        questionsFood.forEach {
            data += it.isCorrectAnswered.toString() + "/"
        }
        questionsNull.forEach {
            data += it.isCorrectAnswered.toString() + "/"
        }
        questionsPerson.forEach {
            data += it.isCorrectAnswered.toString() + "/"
        }
        questionsSport.forEach {
            data += it.isCorrectAnswered.toString() + "/"
        }
        questionsSubjects.forEach {
            data += it.isCorrectAnswered.toString() + "/"
        }
        File(filesDir, "userData.txt").writeText(data)

    }

    override fun onStart() {
        super.onStart()
        try {
            val userData = File(filesDir, "userData.txt").readText().split("/")

            for (i in 0..questionsAnimals.size){
                questionsAnimals[i].isCorrectAnswered = userData[i].toBoolean()
            }
        }
        catch (ex: Exception){
            println(ex.message)
        }
    }
}


@Composable
fun Learn_Word(navController: NavController, username: String) {

    Column(modifier = Modifier.background(colorResource(id = R.color.yellow_1))) {
        Box(
            Modifier
                .fillMaxWidth()
                .height(75.dp)
        ) {
            Row(
                Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = username,
                    Modifier.padding(10.dp),
                    fontSize = 20.sp
                )
                FullApp()
            }
        }
        LazyColumn(Modifier.fillMaxSize()) {
            items(items = categories, itemContent = { item ->
                Spacer(Modifier.height(10.dp))
                MyCard(
                    navController = navController,
                    route = item[0].toString(),
                    text = item[1].toString(),
                    color = item[2] as Int,
                    questions = item[3] as List<Question>
                )
            })
        }
    }
}

@Composable
fun MyCard(
    navController: NavController,
    route: String,
    text: String, color: Int,
    questions: List<Question>
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp)
            .clickable { navController.navigate(route) },
        shape = RoundedCornerShape(15.dp),
        elevation = 10.dp
    ) {
        Box {
            Row(
                Modifier
                    .fillMaxSize()
                    .background(colorResource(color)),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = text, fontSize = 25.sp,
                    modifier = Modifier.padding(7.dp),
                    textAlign = TextAlign.Center
                )
                App(questions = questions)
            }
        }
    }
}
