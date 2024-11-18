package com.example.spotify

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            modifier = Modifier.size(100.dp),
            shape = CircleShape,
            color = Color.Gray
        ) {
            Icon(Icons.Default.Person, contentDescription = "Buscar")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Nombre de Usuario", fontSize = 24.sp, color = Color.White)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Tus listas de reproducción y configuraciones", fontSize = 16.sp, color = Color.Gray)
    }
}
