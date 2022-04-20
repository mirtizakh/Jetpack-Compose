package com.android.composeudemyexplanation.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.android.composeudemyexplanation.GreetingText

val namesList = listOf("Shoaib", "Shahid", "Imran")

@Composable
fun DynamicContentComposable(names: List<String>) {

    Column(modifier = Modifier.wrapContentSize()) {
        for (name in names) {
            GreetingText(name = name)
        }
    }
}