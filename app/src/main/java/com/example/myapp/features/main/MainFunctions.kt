package com.example.myapp.features.main

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapp.features.modifier


@Composable
fun menuIcon() {
    val menuIconPadding = PaddingValues(
        start = 15.dp,
        top = 20.dp,
    )
    Row(
        modifier.padding(menuIconPadding)
    ) {
        Text(
            text = "TT",
            style = MaterialTheme.typography.h3,
        )
    }
}

@Composable
fun pageDirection(page: String) { //TODO make scrollable till menu icon - seperate functions
    val startPadding = PaddingValues(
        start = 30.dp,
        top = 30.dp,
        end = 30.dp,
    )

    Row(
        modifier.padding(startPadding)
    ) {
        Text(
            text = page,
            style = MaterialTheme.typography.h2,
        )
    }
}
