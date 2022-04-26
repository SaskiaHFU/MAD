package com.example.myapp.features.mealplan


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.myapp.features.contentPadding
import com.example.myapp.features.main.menuIcon
import com.example.myapp.features.main.pageDirection
import com.example.myapp.features.modifier


@Composable
fun MyWeekScreen() {

    Column(
        modifier.verticalScroll(rememberScrollState())
    ) {


        //Call Header
        menuIcon()
        pageDirection("My Week")

        //Content
        Box(
            modifier
                .padding(contentPadding)
        ) {
            Column {
                PrintWeekLayout()
            }
        }
    }
    // Button Bottom

    Column(
        modifier
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(
            modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colors.background),
            horizontalArrangement = Arrangement.End,
        ) {
            Button(
                onClick = {
                    //TODO Code Delete clicked Items Button action
                },
                modifier
                    .clip(
                        shape = RoundedCornerShape(
                            topStart = 30.dp,
                            bottomStart = 30.dp
                        )
                    ),
                contentPadding = PaddingValues(
                    top = 24.dp,
                    bottom = 24.dp,
                    start = 40.dp,
                    end = 24.dp
                ),
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
            ) {
                Text(
                    text = "Clear Week",
                    style = MaterialTheme.typography.button,
                )
            }

        }
    }
}






