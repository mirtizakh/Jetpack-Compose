package com.android.composeudemyexplanation.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.android.composeudemyexplanation.GreetingTextWithModifier

@Composable
fun DynamicListComposable() {
    // We donot want after recomposition this state to be gome
    // We need to use remember block here , this will allow the state will be remembered over recomposition
    val greetingListState = remember { mutableStateListOf("Shoaib") }
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        GreetingList(greetingListState) { greetingListState.add("Shahid") }
    }
}

@Composable
private fun GreetingList(namesList: List<String>, buttonClick: () -> Unit) {

    for (name in namesList) {
        GreetingTextWithModifier(name = name)
    }

    Button(onClick = buttonClick) {
        Text(text = "Add new name")
    }
}