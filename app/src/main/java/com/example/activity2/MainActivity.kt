package com.example.activity2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity2.ui.theme.Activity2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Activity2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicCompose(modifier: Modifier = Modifier) {       // Memberikan parameter --> Function defaultnya membutuhkan pengubah
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,         // Mengatur aligment
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()                             // Mengatur Column agar mengisi seluruh string didalam tersebut.

    )

    {
        // Membuat Teks "Login"
        Text(
            text = "Login",
            style = TextStyle(                  // Memberikan stylenya untuk ukuran,dan ketebalan
                fontSize = 70.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1C2833)   // Memberikan warna

            )

        )



    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Activity2Theme {
        BasicCompose()              // Memanggil fungsi composable BasicCompose()
    }
}