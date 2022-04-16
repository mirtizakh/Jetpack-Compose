package com.android.composeudemyexplanation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// We can stores composable in different files
@Composable
fun GreetingText(name: String) {
    Text(text = " Hello $name!")
}

// Modifying composable with Modifier
@Composable
fun GreetingTextWithModifier(name: String) {
    Text(
        text = " Hello $name!",
        modifier = Modifier
            .width(80.dp)
            .height(80.dp)
    )
}

@Composable
fun GreetingTextWithSizeModifier(name: String) {
    Text(
        text = " Hello $name!",
        modifier = Modifier
            .size(width = 80.dp, height = 80.dp)
    )
}


@Composable
fun GreetingTextWithFillMaxSizeModifier(name: String) {
    Text(
        text = " Hello $name!",
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun GreetingTextWithFillMaxWidthModifier(name: String) {
    Text(
        text = " Hello $name!",
        modifier = Modifier.fillMaxWidth(0.5f)  // It will take half width of the parent
    )
}