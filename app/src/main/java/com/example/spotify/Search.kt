package com.example.spotify

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        BasicTextField(
            value = "Buscar en Spotify",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp))
                .padding(16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text("Explorar todo", fontSize = 24.sp, color = Color.White)
        // Agrega más categorías como en la interfaz de Spotify
    }
}
