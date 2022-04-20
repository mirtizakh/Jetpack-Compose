package com.android.composeudemyexplanation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.composeudemyexplanation.composables.DynamicContentComposable
import com.android.composeudemyexplanation.composables.namesList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DynamicContentComposable(namesList)
        }
    }
}


@Preview(showBackground = true)
@Composable
// We can give any name to this preview function
fun DefaultPreviewMainActivity() {
    DynamicContentComposable(namesList)
}