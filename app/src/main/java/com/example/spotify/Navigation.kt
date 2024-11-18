package com.example.spotify

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf("home", "search", "profile")
    NavigationBar(
        containerColor = Color.Black,
        contentColor = Color.White
    ) {
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route
        items.forEach { screen ->
            NavigationBarItem(
                icon = { /* Aquí puedes agregar iconos para cada pantalla */ },
                label = { Text(screen.capitalize()) },
                selected = currentRoute == screen,
                onClick = { navController.navigate(screen) }
            )
        }
    }
}
