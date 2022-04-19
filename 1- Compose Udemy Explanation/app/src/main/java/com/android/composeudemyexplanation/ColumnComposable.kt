package com.android.composeudemyexplanation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColumnComposable() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            VerticalColoredBar(Color.Magenta)
            VerticalColoredBar(Color.Red)
            VerticalColoredBar(Color.Blue)
            VerticalColoredBar(Color.Yellow)
            VerticalColoredBar(Color.Green)
        }
    }
}

@Composable
fun VerticalColoredBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier.size(350.dp, 100.dp)
    ) {}
}