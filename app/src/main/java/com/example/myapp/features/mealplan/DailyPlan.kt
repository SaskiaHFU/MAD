package com.example.myapp.features.mealplan

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapp.features.modifier

class DailyMeals(breakfast: String, lunch: String, dinner: String) {
    var breakfastName = breakfast
    var lunchName = lunch
    var dinnerName = dinner
}

@Composable
fun PrintMealLine(pm_breakfast: String, pm_lunch: String, pm_dinner: String) {

    val textRegular = MaterialTheme.typography.body1
    var dailyMeal =
        DailyMeals(pm_breakfast, pm_lunch, pm_dinner) //Get Parameters and save for Array value


    Row() {
        Text(
            text = "Breakfast: ",
            style = textRegular,
        )
        if (dailyMeal.breakfastName == "") {
            addMealButtonIcon(category = "breakfast")
        } else {
            TextButton(
                onClick = { /*TODO*/ },
            ) {
                Text(
                    text = dailyMeal.breakfastName, // Get Class Var
                    style = textRegular,
                )
            }

        }
    }

    //Lunch Space
    Row() {
        Text(
            text = "Lunch: ",
            style = textRegular, // TODO Make bold
        )
        if (dailyMeal.lunchName == "") {
            addMealButtonIcon(category = "lunch")
        } else {

            TextButton(
                onClick = { /*TODO*/ },
            ) {
                Text(
                    text = dailyMeal.lunchName, // Get Class Var
                    style = textRegular,
                )
            }
        }
    }


    //Dinner Space

    Row() {

        Text(
            text = "Dinner: ",
            style = textRegular, // TODO Make bold
        )
        if (dailyMeal.dinnerName == "") {
            addMealButtonIcon(category = "dinner")
        } else {
            TextButton(
                onClick = { /*TODO*/ },
                //modifier.width(50.dp)
            ) {
                Text(
                    text = dailyMeal.dinnerName, // Get Class Var
                    style = textRegular,
                )
            }
        }

    }

    Spacer(modifier.height(30.dp))

    Divider(
        color = MaterialTheme.colors.primary,
        modifier = Modifier
            .fillMaxWidth()
            .width(1.dp)
    )

    Spacer(modifier.height(30.dp))


}


