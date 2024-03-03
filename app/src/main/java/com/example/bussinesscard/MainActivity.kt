package com.example.bussinesscard

import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinesscard.ui.theme.BussinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Main()

                }
            }
        }
    }
}

@Composable
fun IconText(name: String, title: String,  modifier: Modifier = Modifier) {
    Column(modifier = modifier

        .background(Color.Black)
        .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Image(
            painter = painterResource(id = R.drawable.baseline_android_24),
            contentDescription = null
        )
        Text(
            text = name,
            color = Color.White,
            fontSize = 50.sp,
            modifier = modifier,



        )
        Text(
            text = title,
            color = Color.White,
            modifier = modifier
        )


    }
}

@Composable
fun TextTwo(modifier: Modifier = Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
            .fillMaxSize()
            .padding(bottom = 50.dp)
            ) {
        Email(email = "kshitij28042003ayush@gmail.com")
        PhoneNumber(num = "+91 8927532447")
        Github(id = "https://github.com/Kshitij28042003")

    }

}







@Composable
fun Email(email: String, modifier: Modifier = Modifier){
    Row(horizontalArrangement = Arrangement.Center,
        modifier = modifier) {
        Icon(
            Icons.Default.Email,
            tint = Color.White,
            contentDescription = "Email"
        )

        Text(
            text = email,
            color = Color.White,
            modifier = modifier

        )
    }

}

@Composable
fun PhoneNumber(num: String,  modifier: Modifier = Modifier ){
    Row (horizontalArrangement = Arrangement.Center,
        modifier = modifier) {
        Icon(
            Icons.Default.Phone,
            tint = Color.White,
            contentDescription = "Phone Number"
        )
        Text(
            text = num,
            color = Color.White,
            modifier = modifier

        )
    }
}

@Composable
fun Github(id: String, modifier: Modifier = Modifier  ){
    Row (horizontalArrangement = Arrangement.Center,
        modifier = modifier) {
        Icon(
            Icons.Default.AccountCircle,
            tint = Color.White,
            contentDescription = "Github Link"
        )
        Text(
            text = id,
            color = Color.White,
            modifier = modifier

        )
    }
}

@Composable
fun Main(){
    Box {
        IconText(
            name = "Kshitij Ayush",
            title = "Android Developer",
            modifier = Modifier
        )
        TextTwo(modifier = Modifier)
    }
}




@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BussinessCardTheme {

        Main()

    }
}