package com.example.activity2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
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

        // Membuat Deskripsi "Ini adalah halaman Login"
        Text(
            text = "Ini adalah halaman Login",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = FontFamily.Cursive,        // Menggunakan font gaya cursive
                color = Color(0xFF2f4f4f)

            ),
            modifier = Modifier.padding(top = 10.dp)        // Memberikana jarak dari login
        )

        // Gambar logo
        Image(
            painter = painterResource(id = R.drawable.umyy),    // fungsi untuk memuat gambar pd res yang terdapat di drawable
            contentDescription = null,
            modifier = Modifier
                .padding(top = 25.dp)       // Mengatur jaraknya agar tidak nempel atasnya
                .size(200.dp)               // Mengatur ukuran gambar
        )

        // Membuat Teks "Nama"
        Text(
            text = "Nama",
            style = TextStyle(
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF2f4f4f)

            ),
            modifier = Modifier.padding(top = 20.dp)
        )

        // Membuat Nama "Nila Ayu Citra Wulan"
        Text(
            text = "Nila Ayu Citra Wulan",
            style = TextStyle(
                fontSize = 23.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Monospace,
                color = Color(0xFF473100)

            ),
            modifier = Modifier.padding(top = 10.dp)
        )

        // Membuat NIM "20220140138"
        Text(
            text = "20220140138",
            style = TextStyle(
                fontSize = 35.sp,                       // .sp --> untuk text
                fontWeight = FontWeight.Medium,
                fontFamily = FontFamily.Serif,
                color = Color(0xFF780027)

            ),
            modifier = Modifier.padding(top = 10.dp)    // .dp --> untuk lainnya
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