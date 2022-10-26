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
            //passa  por parametro a mesangem "Android" para o metodo "MessageCard"
            MessageCard(name = "Android")
        }
    }
}
//@Composable irá transformar o metodo em composto
@Composable
fun MessageCard(name: String) {
    //coloca as String "Hello" e "Android" em uma frase só
    Text(text = "Hello $name!")
}
//Preview irá possiblitar a vizualização do app previamente, porém ele
//não funciona em metodos com passagem de parametro, por isso é criada uma nova
//para podermos vizualizar o design do app
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    MessageCard(name = "Android")
}