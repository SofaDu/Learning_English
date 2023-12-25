package com.example.learning_english.authorization

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

data class User(val username: String)

class MainViewModel : ViewModel() {
    val users = mutableStateListOf(
        User("user1"),
        User("user2"),
        User("user3")
    )

    fun addUser(username: String) {
        users.add(User(username))
    }

    fun isUserValid(username: String): Boolean {
        return users.any { it.username == username }
    }
}
