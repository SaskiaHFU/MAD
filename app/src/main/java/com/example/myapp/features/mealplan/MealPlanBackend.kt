package com.example.myapp.features.mealplan

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.myapp.features.modifier


@Composable
fun addMealButtonIcon(category: String) { //TODO code category/day Class or however it goes in

    IconButton(
        onClick = { /*TODO Code Add Meal Button*/ },
        modifier.size(25.dp)
    ) {
        Icon(
            Icons.Default.Add,
            contentDescription = "Add Meal",
            tint = MaterialTheme.colors.secondary,
        )
    }
}