package com.example.myapp.features.seasonGuide

import androidx.compose.foundation.*
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
import com.example.myapp.R
import com.example.myapp.features.*
import com.example.myapp.features.main.menuIcon
import com.example.myapp.features.main.pageDirection
import com.example.myapp.features.recipe.allRecipes

@Composable
fun SeasonGuideScreen() {

    Column(
        modifier
            .fillMaxWidth(),
    ) {

//Call Header
        menuIcon()
        pageDirection("Seasonal Guide")

//Call Months

        Box(
            modifier.padding(containerPadding)
        ) {
            Row(
                modifier.horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(15.dp),
            ) {
                for (month in months) {

                    TextButton(
                        onClick = {
                            //TODO Code Choose Month Button action
                            //Give attribute active as class parameter
                        },

                        ) {
                        Text(
                            text = month,
                            style = MaterialTheme.typography.body1,

                            )

                    }
                }
            }

            Spacer(modifier.height(25.dp))
        }

        Box(
            modifier
                .padding(15.dp)
                .clip(RoundedCornerShape(30.dp))
                .fillMaxSize()
                .background(MaterialTheme.colors.surface)

        ) {

            Column(
                modifier
                    .verticalScroll(rememberScrollState())
                    .padding(boxPadding)

            ) {

                Row(
                    modifier.fillMaxWidth()
                ) {

                    printVegetableLayout(allVegetables.first())


                }
            }

        }

    }
}



