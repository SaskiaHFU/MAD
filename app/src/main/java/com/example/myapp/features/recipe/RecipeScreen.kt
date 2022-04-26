package com.example.myapp.features.recipe


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import com.example.myapp.features.main.menuIcon
import com.example.myapp.features.modifier


@Composable
fun RecipeScreen() {

    Column(
        modifier
            .fillMaxSize()
    ) {

        //Call Header
        menuIcon()

        PrintRecipe(allRecipes.first())
    }
}
