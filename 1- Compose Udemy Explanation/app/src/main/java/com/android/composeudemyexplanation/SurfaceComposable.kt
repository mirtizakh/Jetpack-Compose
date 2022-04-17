package com.android.composeudemyexplanation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MainScreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Wrapped Content",
            modifier = Modifier.wrapContentSize(),
            style = MaterialTheme.typography.h3
        )
    }
}

// Align composables with wrapped content
@Composable
fun InnerSurfaceComposable() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color.Magenta,
            modifier = Modifier.wrapContentSize(align = Alignment.BottomCenter)
        ) {
            Text(
                text = "Wrapped Content",
                style = MaterialTheme.typography.h3
            )
        }
    }
}