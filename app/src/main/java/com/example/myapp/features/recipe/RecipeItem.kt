package com.example.myapp.features.recipe

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun PrintRecipe(recipe: Recipe) {

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
            Image(
                painter = painterResource(recipe.img),
                contentDescription = recipe.name,
                contentScale = ContentScale.Fit
            )
        }

// Content
        Box(
            modifier
                .padding(contentPadding)
                .fillMaxHeight()
        ) {
            Column {
                //Edit Button
                Row(
                    modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(
                        onClick = {
                            //TODO Code edit recipe Button action
                        }
                    ) {
                        Text(
                            text = "Edit",
                            style = MaterialTheme.typography.body2,
                        )
                    }
                }
//Name
                Text(
                    text = recipe.name,
                    style = MaterialTheme.typography.h2,
                    overflow = TextOverflow.Ellipsis,
                )
                Spacer(modifier.height(45.dp))

//Category
                Row() {
                    Text(
                        text = "Category", //TODO Braucht man das überhaupt wenn es unten nochmal angezeigt wird?
                        style = MaterialTheme.typography.body2,
                        overflow = TextOverflow.Ellipsis,
                    )
                    Spacer(modifier.width(10.dp))
                    Text(
                        text = recipe.category, //TODO Code Flexible
                        style = MaterialTheme.typography.body2,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                Spacer(modifier.height(45.dp))

// Zutaten
                Text(
                    text = "Ingredients",
                    style = MaterialTheme.typography.h5,
                )
                Spacer(modifier.height(10.dp))

                val ingredients = recipe.ingredients
                for (ingredient in ingredients) {
                    Row(
                        modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = ingredient,
                            style = MaterialTheme.typography.body1,
                            overflow = TextOverflow.Ellipsis,
                        )
                        IconButton(
                            onClick = {
                                //TODO Code Add Meal Button action
                            },
                            modifier.size(25.dp)
                        ) {
                            Icon(
                                Icons.Default.Add, //TODO Change Icon -> 2 faces
                                contentDescription = "Add to Shopping List",
                                tint = MaterialTheme.colors.surface,
                            )
                        }
                    }
                    Divider(
                        color = Color(0xFFEBEBEB),
                        modifier = Modifier
                            .fillMaxWidth()
                            .width(1.dp)
                            .padding(top = 5.dp, bottom = 5.dp)
                    )
                }
                Spacer(modifier.height(45.dp))

// Steps
                Text(
                    text = "Steps",
                    style = MaterialTheme.typography.h5,
                )
                Spacer(modifier.height(10.dp))

                val steps = recipe.steps
                var countSteps = 0
                for (step in steps) {
                    countSteps++
                    Row() {
                        if (countSteps == 1) {
                            Spacer(modifier.width(5.dp))
                        }
                        Text(
                            text = "$countSteps. ",
                            style = MaterialTheme.typography.body1, //TODO Print bold
                        )
                        Text(
                            text = step,
                            style = MaterialTheme.typography.body1,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                Spacer(modifier.height(45.dp))

                Text(
                    text = "Add to Meal Plan",
                    style = MaterialTheme.typography.h5,
                )
                Spacer(modifier.height(10.dp))

//Add to Meal Week
                Row(
                    modifier.fillMaxWidth()
                ) {
                    for (day in days) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            TextButton(
                                onClick = {
                                    //TODO Code Choose Day Button action
                                },

                                ) {
                                Text(
                                    text = day,
                                    style = MaterialTheme.typography.body1,

                                    )
                            }
                        }


                    }
                }
                Spacer(modifier.height(20.dp))

                //Category
                Row() {
                    TextButton(
                        onClick = {
                            //TODO Code Button action
                            //ID = 1 --> function if ID == 1 insert in category Breakfast
                        },
                    ) {
                        Text(
                            text = "Breakfast",
                            style = MaterialTheme.typography.body1,
                        )
                    }
                    Spacer(modifier.width(10.dp))

                    TextButton(
                        onClick = {
                            //TODO Code Button action
                            //ID = 2 --> function if ID == 2 insert in category Lunch
                        }
                    ) {
                        Text(
                            text = "Lunch",
                            style = MaterialTheme.typography.body1,
                        )
                    }
                    Spacer(modifier.width(10.dp))

                    TextButton(
                        onClick = {
                            //TODO Code Button action
                            //ID = 3 --> function if ID == 3 insert in category Dinner
                        }
                    ) {
                        Text(
                            text = "Dinner",
                            style = MaterialTheme.typography.body1,
                        )
                    }
                }
                Spacer(modifier.height(45.dp))

//Source
                Text(
                    text = "Source",
                    style = MaterialTheme.typography.h4,
                )

                Spacer(modifier.height(10.dp))

                Row() {
                    Text(
                        text = "Buddah Bowl | Kochkarusell",
                        style = MaterialTheme.typography.body2,
                        overflow = TextOverflow.Ellipsis,
                    )

                    Spacer(modifier.width(10.dp))

                    IconButton(
                        onClick = {
                            //TODO Code Link Button action
                        },
                        modifier.size(25.dp)
                    ) {
                        Icon(
                            Icons.Default.Add, //TODO Change Icon
                            contentDescription = "Follow Link",
                            tint = MaterialTheme.colors.secondary,
                        )
                    }
                }
                Spacer(modifier.height(30.dp))
            }
        }
    }
}




