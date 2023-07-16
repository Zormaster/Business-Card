package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            ){
        LogoNameAndTitle(name = "Zormaster", jobTitle = "Senior App Developer")
        ContactInformation(phone = "000-000-0000", social = "@coolnametag", email = "contactme@gmail.com")
    }
}

@Composable
fun LogoNameAndTitle(name: String, jobTitle: String){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight(0.7f)
            .fillMaxWidth()
            ){
        val androidLogo = painterResource(id = R.drawable.ddcddda1151bdabce519bfc559a8e250)
        Image(
            painter = androidLogo,
            contentDescription = "Developer Logo",
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Text(
            text = name,
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp)
        )
        Text(
            text = jobTitle,
            fontSize = 24.sp,
//            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp)
        )
    }
}

@Composable
fun ContactInformation(phone: String, social: String, email: String) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(top = 10.dp, bottom = 10.dp)
                ){
            val phoneIcon = painterResource(id = R.drawable.phone_icon_13_256)
            Image(
                painter = phoneIcon,
                contentDescription = "Phone Icon",
                modifier = Modifier
                    .padding(start = 50.dp)
                    .fillMaxHeight(),
                contentScale = ContentScale.Fit
            )
            Text(
                text = phone,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.End)
                    .padding(start = 16.dp, end = 50.dp)
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(top = 10.dp, bottom = 10.dp)
        ){
            val socialIcon = painterResource(id = R.drawable.sharethis)
            Image(
                painter = socialIcon,
                contentDescription = "Social Icon",
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(start = 50.dp),
                contentScale = ContentScale.Fit
            )
            Text(
                text = social,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.End)
                    .padding(start = 16.dp, end = 50.dp)
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(top = 10.dp, bottom = 10.dp)
        ){
            val emailIcon = painterResource(id = R.drawable.mail)
            Image(
                painter = emailIcon,
                contentDescription = "Mail Icon",
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(start = 50.dp),
                contentScale = ContentScale.Fit
            )
            Text(
                text = email,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.End)
                    .padding(start = 16.dp, end = 50.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCard()
}