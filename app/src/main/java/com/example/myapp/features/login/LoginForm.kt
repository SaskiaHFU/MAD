package com.example.myapp.features

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginForm() { //TODO build Login Form
    val textRegular = MaterialTheme.typography.body1
    Text(
        text = "Text Inputs",
        style = textRegular,
    )
    Spacer(modifier.height(30.dp))
    Text(
        text = "Password",
        style = textRegular,
    )
}