package com.android.composeudemyexplanation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
            .width(100.dp)
            .height(80.dp),
        style = MaterialTheme.typography.h5
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

@Composable
fun GreetingTextWithClickableModifier(name: String) {
    Text(
        text = " Hello $name!",
        modifier = Modifier
            .size(width = 80.dp, height = 80.dp)
            .clickable(onClick = { })
    )
}

@Composable
fun GreetingTextWithPaddingModifier(name: String) {
    Text(
        text = " Hello $name!",
        modifier = Modifier
            .size(width = 200.dp, height = 80.dp)
            .clickable(onClick = { })
            .padding(all = 24.dp)
        // Or we do like   .padding(start = 24.dp)

    )
}

@Composable
fun CustomizeGreetingText(name: String) {
    Text(
        text = " Hello $name!",
        modifier = Modifier
            .size(width = 200.dp, height = 80.dp)
            .clickable(onClick = { })
            .padding(all = 24.dp),
        style = TextStyle(
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
    )
}

@Composable
fun MaterialGreetingText(name: String) {
    Text(
        text = " Hello $name!",
        modifier = Modifier
            .size(width = 200.dp, height = 80.dp)
            .clickable(onClick = { })
            .padding(all = 24.dp),
        style = MaterialTheme.typography.h5,
        fontWeight = FontWeight.SemiBold
    )
}