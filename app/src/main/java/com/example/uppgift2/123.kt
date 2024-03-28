package com.example.uppgift2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun XYrow(productname: String) {
    Row (modifier = Modifier.background(Color.White)) {
        Text(productname)
    }


}