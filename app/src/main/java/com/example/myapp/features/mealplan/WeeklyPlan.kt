package com.example.myapp.features.mealplan

import androidx.compose.animation.expandVertically
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapp.features.days
import com.example.myapp.features.modifier

@Composable
fun PrintMealDay(day: String) {
    Column(
        modifier.fillMaxWidth(),
    ) {
        Text(
            text = day,
            style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.secondary,
        )
        Spacer(modifier.height(20.dp))
    }
}

@Composable
fun PrintWeekLayout() {


    PrintMealDay(day = days.elementAt(0))
    PrintMealLine(pm_breakfast = "", pm_lunch = "Sandwich", pm_dinner = "Pasta")

    PrintMealDay(day = days.elementAt(1))
    PrintMealLine(pm_breakfast = "Oats 2", pm_lunch = "Sandwich 2", pm_dinner = "Pasta 2")

    PrintMealDay(day = days.elementAt(2))
    PrintMealLine(pm_breakfast = "Oats 2", pm_lunch = "Sandwich 2", pm_dinner = "Pasta 2")

    PrintMealDay(day = days.elementAt(3))
    PrintMealLine(pm_breakfast = "Oats 2", pm_lunch = "Sandwich 2", pm_dinner = "Pasta 2")

    PrintMealDay(day = days.elementAt(4))
    PrintMealLine(pm_breakfast = "Oats 2", pm_lunch = "Sandwich 2", pm_dinner = "Pasta 2")

    PrintMealDay(day = days.elementAt(5))
    PrintMealLine(pm_breakfast = "Oats 2", pm_lunch = "Sandwich 2", pm_dinner = "Pasta 2")

    PrintMealDay(day = days.elementAt(6))
    PrintMealLine(pm_breakfast = "Oats 2", pm_lunch = "Sandwich 2", pm_dinner = "Pasta 2")

}



