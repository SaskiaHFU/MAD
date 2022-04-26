package com.example.myapp.features.shopping


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.myapp.features.bottomBarPadding
import com.example.myapp.features.contentPadding
import com.example.myapp.features.main.menuIcon
import com.example.myapp.features.main.pageDirection
import com.example.myapp.features.modifier


@Composable
fun ShoppingCartScreen() { //TODO make scrollable

    Column(
        modifier
            .fillMaxWidth(),
    ) {
        //Call Header
        menuIcon()
        pageDirection("Shopping Cart")

        Box(
            modifier
                .fillMaxHeight()
        ) {
            Column(
                modifier
                    .padding(contentPadding)
            ) {

                //TODO List items
            }

            //Buttons Bottom
            Column(
                modifier
                    .fillMaxHeight()
                    .padding(bottomBarPadding),
                verticalArrangement = Arrangement.Bottom
            ) {
                Row(
                    modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = {
                            //TODO Code Delete clicked Items Button action
                        },
                        modifier
                            //.size(height = 40.dp, width = 115.dp)
                            .clip(shape = RoundedCornerShape(topEnd = 30.dp, bottomEnd = 30.dp)),
                        contentPadding = PaddingValues(
                            top = 24.dp,
                            bottom = 24.dp,
                            start = 40.dp,
                            end = 24.dp
                        ),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                    ) {
                        Text(
                            text = "Delete all clicked",
                            style = MaterialTheme.typography.button,

                            )
                    }
                    Button(
                        onClick = {
                            //TODO Code Clear List Items Button action
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
                            start = 24.dp,
                            end = 40.dp
                        ),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),


                        ) {
                        Text(
                            text = "Clear list",
                            style = MaterialTheme.typography.button,

                            )

                    }

                }

            }
        }
    }
}


