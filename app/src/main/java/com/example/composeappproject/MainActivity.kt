package com.example.composeappproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeappproject.ui.theme.ComposeAppProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}
data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {

    Text(text = msg.author)
    Text(text = msg.body)
}

@Preview
@Composable
fun DefaultPreview() {

    MessageCard(Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!"))
}