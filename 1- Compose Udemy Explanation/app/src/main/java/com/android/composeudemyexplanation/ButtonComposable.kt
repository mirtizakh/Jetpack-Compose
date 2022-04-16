package com.android.composeudemyexplanation

import androidx.compose.material.Button
import androidx.compose.runtime.Composable

@Composable
fun GreetingButton() {
    Button(onClick = { }) {
        GreetingText(name = "button")   // Row scope is the horizontal space

    }
}

@Composable
fun GreetingButtonMultiText() {
    Button(onClick = { }) {
        GreetingText(name = " button")
        GreetingText(name = " remaining button")
    }
}