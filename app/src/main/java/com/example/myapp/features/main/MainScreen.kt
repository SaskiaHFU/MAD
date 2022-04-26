package com.example.myapp.features.main


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapp.features.login.LoginScreen
import com.example.myapp.features.recipe.EditRecipeScreen
import com.example.myapp.features.recipe.RecipeScreen
import com.example.myapp.features.seasonGuide.SeasonGuideScreen
import com.example.myapp.features.signup.SignupScreen


@Composable
fun MainScreen() {


    // if != loggedIn
    //LoginScreen()
    // else HomeScreen()

    SignupScreen()

    //ShoppingCartScreen()

    //MyWeekScreen()

    //RecipeScreen()

    //EditRecipeScreen()

    //SeasonGuideScreen()

}

@Composable
@Preview
fun MainScreen_Preview() {
    MainScreen()
}
