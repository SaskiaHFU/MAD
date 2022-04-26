package com.example.myapp.features.recipe

import androidx.compose.runtime.Composable
import com.example.myapp.R

data class Recipe(
    val id: String,
    val name: String,
    val img: Int,
    val ingredients: MutableList<String>,
    val steps: MutableList<String>,
    val category: String

)

val allRecipes = listOf(

    Recipe(
        id = "rezept 1",
        name = "Rezept 1",
        img = R.drawable.bowl_png,
        ingredients = arrayListOf("Zutat 1", "Zutat 2", "Zutat 3"),
        steps = arrayListOf("Schritt 1", "Schritt 2", "Schritt 3"),
        category = "Dinner"
    )
)


@Composable
fun addToCategoryButton () {

}

