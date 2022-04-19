package com.android.composeudemyexplanation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.composeudemyexplanation.ui.theme.ComposeUdemyExplanationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnComposable()
        }
    }
}


@Preview(showBackground = true)
@Composable
// We can give any name to this preview function
fun DefaultPreviewMainActivity() {
    ColumnComposable()
}