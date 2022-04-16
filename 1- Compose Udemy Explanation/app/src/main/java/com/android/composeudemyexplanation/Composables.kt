package com.android.composeudemyexplanation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

// We can stores composable in different files
@Composable
fun GreetingText(name: String) {
    Text(text = "Hello $name!")
}