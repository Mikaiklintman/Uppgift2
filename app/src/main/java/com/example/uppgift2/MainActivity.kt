package com.example.uppgift2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uppgift2.ui.theme.Uppgift2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Uppgift2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    XandY()
                }
            }
        }
    }
}

@Composable
fun XandY() {

    var XYitems = remember {
            mutableStateListOf("")
    }

    Column {

        Column (modifier = Modifier
            .height(150.dp)
            .fillMaxWidth()
            .background(Color.Blue))  {
            Text("Hejsan")

            Button(onClick = {
                XYitems.add("X")
            }) {
                Text("X")
            }

            Button(onClick = {
                XYitems.add("Y")
            }) {
                Text("Y")
            }

        }

        LazyColumn {

            items(XYitems) {XYitems ->
                XYrow(productname = XYitems)
            }
            
            items(11) {index ->
                Text(text = "Item: $index")
            }



            }
        Button(onClick = {
            XYitems.clear()
        }) {
            Text("Reset")
        }

        }

    }








@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Uppgift2Theme {
        XandY()
    }
}