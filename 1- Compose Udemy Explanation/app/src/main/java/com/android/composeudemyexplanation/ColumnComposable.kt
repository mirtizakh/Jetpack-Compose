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
            HorizontalRowBar(Color.Magenta)
            HorizontalRowBar(Color.Red)
            HorizontalRowBar(Color.Blue)
            HorizontalRowBar(Color.Yellow)
            HorizontalColumnBar(Color.Green)
        }
    }
}

@Composable
fun HorizontalRowBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier.size(60.dp, 600.dp)
    ) {}
}