package com.example.myapp.features.signup

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.features.contentPadding
import com.example.myapp.features.main.pageDirection
import com.example.myapp.features.modifier


@Composable
fun SignupScreen() {
    val signInPadding = PaddingValues(
        start = 30.dp,
        top = 30.dp,
        end = 30.dp,
        )

    //Upper Part
    Column(
        modifier
            .fillMaxWidth(),
    ) {
        Row(
            modifier
                .padding(signInPadding)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "Sign Up",
                style = MaterialTheme.typography.h1,
            )

            IconButton(
                onClick = {
                    //text.value = "Refresh clicked. "
                },
            ) {
                Icon(
                    Icons.Filled.Add, //TODO Change Icon
                    contentDescription = "Close Sign Up",
                    modifier.size(50.dp)
                    )
            }
        }

        Spacer(modifier.height(50.dp))

        //Sign Up
        SignupForm()

    }
}


