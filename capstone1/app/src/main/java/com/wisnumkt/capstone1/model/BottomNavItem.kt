package com.wisnumkt.capstone1.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomNavItem(val label: String, val icon: ImageVector, val screenRoute: String) {
    Home("Home", Icons.Default.Home, "home"),
    Place("Maps", Icons.Default.Place, "maps"),
    Email("Chat", Icons.Default.Email, "chat"),
    Person("Profile", Icons.Default.Person, "profile")
}
