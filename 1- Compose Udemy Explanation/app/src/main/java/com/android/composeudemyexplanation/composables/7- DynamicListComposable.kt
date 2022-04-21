package com.android.composeudemyexplanation.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.android.composeudemyexplanation.GreetingTextWithModifier

@Composable
fun DynamicListComposable() {

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        GreetingList()
    }
}


@SuppressLint("UnrememberedMutableState")
@Composable
private fun GreetingList() {
    val greetingListState = mutableStateListOf<String>("Shoaib")
    for (name in greetingListState) {
        GreetingTextWithModifier(name = name)
    }

    Button(onClick = { greetingListState.add("Shahid") }) {
        Text(text = "Add new name")
    }
}