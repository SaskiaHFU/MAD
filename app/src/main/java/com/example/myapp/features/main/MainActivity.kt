package com.example.myapp.features.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Call MainScreen
                    MainScreen()
                }
            }
        }
    }
}

/*
@Composable
fun Greeting(name: String) {
//    Text(text = "Hello $name!")

    Text(text = "Welcome",
        style = MaterialTheme.typography.h1)
    Text(text = "Heading",
        style = MaterialTheme.typography.h2)
    Text(text = "Text",
        style = MaterialTheme.typography.body1)

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyAppTheme {
        Greeting("Android")
    }
}*/
