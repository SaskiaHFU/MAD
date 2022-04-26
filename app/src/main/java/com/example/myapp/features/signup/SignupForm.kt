package com.example.myapp.features.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.R
import com.example.myapp.features.containerPadding
import com.example.myapp.features.modifier

@Composable
fun SignupForm() {
    val font = MaterialTheme.typography.body1
    val signupImg = R.drawable.plant_signup

    Column(
        verticalArrangement = Arrangement.spacedBy(45.dp)
    ) {
        Column(
            modifier.padding(containerPadding),
            verticalArrangement = Arrangement.spacedBy(45.dp)
        ) {

            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(
                    text = "Email",
                    style = font,
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(
                    text = "Name",
                    style = font,
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(
                    text = "Password",
                    style = font,
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(
                    text = "Repeat Password",
                    style = font,
                )
            }
        }

        Column(
            modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Bottom
        ) {

            Box(
            ) {
                Row(
                    modifier.align(Alignment.BottomStart)
                ) {
                    Image(

                        painter = painterResource(signupImg),
                        contentDescription = "Plant",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .width(413.dp),
                    )
                }

                Row(
                    modifier.fillMaxWidth()
                        .align(Alignment.BottomEnd),
                    horizontalArrangement = Arrangement.End,
                ) {
                    Button(
                        onClick = {
                            //TODO Code Sign Up Button action
                        },
                        modifier
                            .size(width = 206.dp, height = 65.dp)
                            .clip(
                                shape = RoundedCornerShape(
                                    topStart = 30.dp,
                                    bottomStart = 30.dp
                                )
                            ),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),

                        ) {
                        Text(
                            text = "Sign Up",
                            style = MaterialTheme.typography.body1
                        )
                    }
                }
            }
        }
    }
}




