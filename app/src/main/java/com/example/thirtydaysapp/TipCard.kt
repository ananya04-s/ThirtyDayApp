package com.example.thirtydaysapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun TipCard(tip: Tip) {

    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        onClick = { expanded = !expanded }
    ) {

        Column(modifier = Modifier.padding(16.dp)) {

            Text(text = "Day ${tip.day}")

            Spacer(modifier = Modifier.height(8.dp))

            Image(
                painter = painterResource(id = tip.image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = tip.title)

            // Expandable description
            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = tip.description)
            }
        }
    }
}