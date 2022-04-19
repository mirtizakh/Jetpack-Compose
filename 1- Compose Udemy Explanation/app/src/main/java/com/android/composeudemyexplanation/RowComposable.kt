package com.android.composeudemyexplanation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun RowComposable() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            HorizontalColumnBar(Color.Magenta)
            HorizontalColumnBar(Color.Red)
            HorizontalColumnBar(Color.Blue)
            HorizontalColumnBar(Color.Yellow)
            HorizontalColumnBar(Color.Green)
        }
    }
}

@Composable
fun HorizontalColumnBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier.size(60.dp, 600.dp)
    ) {}
}