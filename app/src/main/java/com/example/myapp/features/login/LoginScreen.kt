package com.example.myapp.features.login


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
import com.example.myapp.features.LoginForm
import com.example.myapp.features.contentPadding
import com.example.myapp.features.modifier


@Composable
fun LoginScreen() {

    val fontSizeSmall = 10.sp
    val regularText = MaterialTheme.typography.body1
    val headings1 = MaterialTheme.typography.h1

    val loginImg = R.drawable.plant_croped

    val startPadding = PaddingValues(
        start = 30.dp,
        top = 215.dp,
        end = 30.dp,

        )


    Column(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.End
    ) {
        Image(

            painter = painterResource(loginImg),
            contentDescription = "Plant",
            contentScale = ContentScale.Fit,
            alignment = Alignment.TopEnd,
            modifier = Modifier
                .width(360.dp)
                .height(630.dp),
        )
    }


    //Upper Part
    Column(

    ) {

        Column(
            modifier
                .padding(startPadding)
        ) {

            Text(
                text = "Welcome",
                style = headings1,
            )
            Text(
                text = "back",
                style = headings1,
            )
        }


        // Login
        Column(
            modifier
                .padding(contentPadding)
        ) {
            // Sign In
            LoginForm()

            //Subinfo
            Row( //check why there is a left padding at Start
                modifier
                    .fillMaxWidth()
                    .padding(0.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                //Reset Password
                TextButton(
                    onClick = {
                        //TODO Code Sign Up Button action
                    },
                ) {
                    Text(
                        text = "Forgot password?",
                        style = regularText,
                        fontSize = fontSizeSmall
                    )
                }

                //Go To Sign Up
                TextButton(
                    onClick = {
                        //TODO Code Sign Up Button action
                    }
                ) {
                    Text(
                        text = "Sign Up",
                        style = regularText,
                        fontSize = fontSizeSmall
                    )
                }
            }
        }
    }


//        Bottom Navbar
    Column(
        modifier
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
    ) {
        Row(
            modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = {
                    //TODO Code Sign In Button action
                },
                modifier
                    .size(width = 206.dp, height = 65.dp)
                    .clip(shape = RoundedCornerShape(topStart = 30.dp, bottomStart = 30.dp)),
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),

                ) {
                Text(
                    text = "Sign In",
                    style = regularText
                )
            }
        }

    }
}