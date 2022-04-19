package com.android.composeudemyexplanation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun NestedRowWithColumnComposable() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                SquareBar(Color.Magenta)
                SquareBar(Color.Red)
            }

            SquareBar(Color.Blue)
            SquareBar(Color.Yellow)
            SquareBar(Color.Green)
        }
    }
}

@Composable
fun SquareBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier.size(100.dp, 100.dp)
    ) {}
}