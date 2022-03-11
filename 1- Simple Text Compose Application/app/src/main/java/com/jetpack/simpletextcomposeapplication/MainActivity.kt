package com.jetpack.simpletextcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingText("Android")
        }
    }
}

@Composable
fun GreetingButton() {
    Button(onClick = { }) {
        GreetingText("Android123")
        GreetingText("Android123")
    }
}

@Composable
fun GreetingText(name: String) {
    Text(
        text = " Hello $name!", modifier = Modifier
            .width(300.dp)
            .height(300.dp)
            .padding(24.dp)
            .clickable { },


        // Order of modifiers matters
//      style = TextStyle(
//          color = Color.Blue,
//          fontWeight = FontWeight.Bold,
//          fontSize = 18.sp)
        style = MaterialTheme.typography.h3
    )
}


// Wrap content of composables
@Composable
fun MainScreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            "Wrapped content",
            modifier = Modifier.wrapContentSize(),
            style = MaterialTheme.typography.h3
        )
    }
}

// Wrap content of composables
// Using 1 surface in another surface
@Composable
fun MainScreen2() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color.Magenta,
            modifier = Modifier.wrapContentSize()
        ) {
            Text(
                "Wrapped content",
                style = MaterialTheme.typography.h3
            )
        }
    }
}

// Align composables with wrap content
@Composable
fun MainScreen3() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color.Magenta,
            modifier = Modifier.wrapContentSize(align = Alignment.BottomCenter)
            // cant use Alignment.CenterHorizontally
        ) {
            Text(
                "Wrapped content",
                style = MaterialTheme.typography.h4
            )
        }
    }
}

// Multiple composables inside a parent
// Overlapping issue
@Composable
fun MainScreen4() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color.Magenta,
            modifier = Modifier.wrapContentSize(align = Alignment.BottomCenter)
            // cant use Alignment.CenterHorizontally
        ) {
            Text(
                "Wrapped content",
                style = MaterialTheme.typography.h4
            )
            Text(
                "Wrapped content 123",
                style = MaterialTheme.typography.h3
            )
        }
    }
}

// Row, Column and Box in composable
// Creating basic layout with Row
// Overlapping issue resolved
@Composable
fun MainScreen5() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row {
            Surface(
                color = Color.Magenta,
                modifier = Modifier.size(100.dp, 300.dp)
            ) {

            }
            Surface(
                color = Color.Red,
                modifier = Modifier.size(100.dp, 300.dp)
            ) {

            }
        }

    }
}

// Row, Column and Box in composable
// Creating basic layout with Row
// Overlapping issue resolved
// Extract composable for reuse
@Composable
fun MainScreen6() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row {
            HorizontalColoredBar(Color.Magenta)
            HorizontalColoredBar(Color.Red)
            HorizontalColoredBar(Color.Blue)
        }
    }
}

@Composable
fun HorizontalColoredBar(color: Color){
    Surface(
        color = color,
        modifier = Modifier.size(60.dp, 300.dp)
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewMainActivity() {
    MainScreen6()
}