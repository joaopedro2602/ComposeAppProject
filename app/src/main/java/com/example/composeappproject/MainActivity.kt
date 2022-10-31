package com.example.composeappproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.composeappproject.ui.theme.ComposeAppProjectTheme
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MessageCard(Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!"))
        }
    }
}
data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    //A função Column permite organizar os elementos verticalmente. Adicione uma Column à função MessageCard.
    //Você pode usar a Row para organizar os itens horizontalmente e a Box para empilhar os elementos
    Row{
        Image(painterResource(R.drawable.profile_picture),
        "Contact profile picture",
            modifier = Modifier
                // deixa a imagem em 40dp
                .size(40.dp)
                // deixa a imagem redonda
                .clip(CircleShape)
        )
        //adiciona um espaço entre a foto e a mensagem
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = msg.author)
            //adiciona um espaço entra o nome e a mensagem
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body)

        }
    }

}

@Preview
@Composable
fun DefaultPreview() {

    MessageCard(Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!"))
}