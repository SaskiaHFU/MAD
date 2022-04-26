package com.example.myapp.features.recipe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.myapp.features.contentPadding
import com.example.myapp.features.days
import com.example.myapp.features.modifier
import com.example.myapp.features.recipeImgPadding

@Composable

fun EditRecipeScreen() {

    //Image
    Column(
        modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier
                .padding(recipeImgPadding)
                .fillMaxHeight(),
        ) {

            Button(
                onClick = {
                    //TODO code upload Img
                },
                modifier
                    .size(height = 150.dp, width = 150.dp)
                    .clip(shape = RoundedCornerShape(30.dp)),
                contentPadding = PaddingValues(
                    top = 50.dp,
                    bottom = 50.dp,
                    start = 50.dp,
                    end = 50.dp
                ),
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
            ) {
                Icon(
                    Icons.Default.Add,
                    contentDescription = "Upload Image",
                    tint = MaterialTheme.colors.background,
                )
            }
        }

// Content
        Box(
            modifier
                .padding(contentPadding)
                .fillMaxHeight()
        ) {
            Column {

//Add Titel
                Row() {
                    Text(
                        text = "Add Title",
                        style = MaterialTheme.typography.body1,
                    )
                    //TODO code input form
                }

                Spacer(modifier.height(40.dp))

//Category

                Column() {

                    Text(
                        text = "Choose Category",
                        style = MaterialTheme.typography.h5,
                        overflow = TextOverflow.Ellipsis,
                    )
                    Spacer(modifier.width(10.dp))


                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        //TODO make responsive on categories number; create function to call Button Layout
                        TextButton(
                            onClick = {
                                //TODO Code Choose Category Button action
                            },

                            ) {
                            Text(
                                text = "Breakfast",
                                style = MaterialTheme.typography.body1,

                                )
                        }
                        TextButton(
                            onClick = {
                                //TODO Code Choose Category Button action
                            },

                            ) {
                            Text(
                                text = "Lunch",
                                style = MaterialTheme.typography.body1,

                                )
                        }
                        TextButton(
                            onClick = {
                                //TODO Code Choose Category Button action
                            },

                            ) {
                            Text(
                                text = "Dinner",
                                style = MaterialTheme.typography.body1,

                                )
                        }
                        TextButton(
                            onClick = {
                                //TODO Code Choose Category Button action
                            },

                            ) {
                            Text(
                                text = "Kids",
                                style = MaterialTheme.typography.body1,

                                )
                        }
                        TextButton(
                            onClick = {
                                //TODO Code Choose Category Button action
                            },

                            ) {
                            Text(
                                text = "Drinks",
                                style = MaterialTheme.typography.body1,

                                )
                        }

                    }


                }

                Spacer(modifier.height(45.dp))

// Zutaten
                Text(
                    text = "Add Ingredients",
                    style = MaterialTheme.typography.h5,
                )
                Spacer(modifier.height(10.dp))

                // TODO create Input fields which insert into created List
                Spacer(modifier.height(45.dp))

// Steps
                Text(
                    text = "Steps",
                    style = MaterialTheme.typography.h5,
                )
                Spacer(modifier.height(10.dp))

                //TODO create Input fields which insert into created list
                Spacer(modifier.height(45.dp))

//Add to Meal Week


//Source
                Text(
                    text = "Add Source Link",
                    style = MaterialTheme.typography.h5,
                )

                Spacer(modifier.height(10.dp))

                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    //TODO code source link form
                    Text(
                        text = "Title",
                        style = MaterialTheme.typography.body1,
                    )
                    Text(
                        text = "Link",
                        style = MaterialTheme.typography.body1,
                    )

                }
                Spacer(modifier.height(30.dp))
            }
        }

//Save Button
        Row(
            modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = {
                    //TODO Code Save Button action
                },
                modifier
                    .size(height= 65.dp, width = 205.dp)
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
                    text = "Save",
                    style = MaterialTheme.typography.button,

                    )

            }
        }

    }
}