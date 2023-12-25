package com.example.learning_english

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.learning_english.authorization.MainViewModel

@Composable
fun Authorization(navController: NavController) {
    val viewModel: MainViewModel = viewModel()
    val usernameState = remember { mutableStateOf("") }
    val isValidUser = viewModel.isUserValid(usernameState.value)

    Column(
        Modifier
            .fillMaxSize()
            .background(colorResource(R.color.yellow_1)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Вход в систему",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            style = MaterialTheme.typography.h5
        )
        TextField(
            value = usernameState.value,
            onValueChange = { usernameState.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = colorResource(id = R.color.green_1),
                cursorColor = Color.Black,
                focusedIndicatorColor = colorResource(id = R.color.green_2),
                unfocusedIndicatorColor = colorResource(id = R.color.green_1)
            ),
            shape = RoundedCornerShape(8.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            textStyle = TextStyle(fontSize = 18.sp)
        )
        if (!isValidUser) {
            Button(
                modifier = Modifier.height(35.dp),
                onClick = {
                    val username = usernameState.value
                    if (username.isNotBlank()) {
                        viewModel.addUser(username)
                        navController.navigate("learn_word/$username")
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.blue_1),
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(8.dp)
            )
            {
                Text(
                    "Войти", fontSize = 18.sp,
                    style = MaterialTheme.typography.button, textAlign = TextAlign.Center)
            }
        }
    }
}