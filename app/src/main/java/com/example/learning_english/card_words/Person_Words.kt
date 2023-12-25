package com.example.learning_english.card_words

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun WordCard(word: String, translation: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(MaterialTheme.shapes.medium), elevation = 4.dp
    )
    {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            Text(text = word, style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = translation, style = MaterialTheme.typography.body1)
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun WordList(words: List<Pair<String, String>>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    )
    { items(words) { (word, translation) -> WordCard(word = word, translation = translation) } }
}

@Composable
fun SearchBar(searchText: TextFieldValue, onSearchTextChange: (TextFieldValue) -> Unit) {
    TextField(
        value = searchText, onValueChange = onSearchTextChange,
        leadingIcon = { },
        placeholder = { Text("Search") }, singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    )
}


@Composable
fun WordCardAppPerson() {
    var searchText by remember { mutableStateOf(TextFieldValue()) }
    val words =
        listOf("Apple" to "Яблоко", "Banana" to "Банан", "Car" to "Машина")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    )
    {
        SearchBar(searchText =
        searchText, onSearchTextChange = { searchText = it })
        WordList(words = words.filter
        { it.first.contains(searchText.text, ignoreCase = true) })
    }
}
