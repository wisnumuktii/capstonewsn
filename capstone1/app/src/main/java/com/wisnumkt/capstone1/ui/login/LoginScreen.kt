package com.wisnumkt.capstone1.ui.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wisnumkt.capstone1.ui.theme.Capstone1Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Text(
            text = "Login",
            fontSize = 26.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            modifier = Modifier
                .offset(x = 157.dp, y = 300.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions.Default,
            modifier = Modifier
                .offset(y = 338.dp)
                .padding(16.dp)
                .fillMaxWidth()
        )

        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Password") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .offset(y = 420.dp)
                .padding(16.dp)
                .fillMaxWidth()
        )

        Button(
            onClick = { /* Aksi ketika tombol Login ditekan */ },
            modifier = Modifier
                .offset(y = 498.dp)
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text("Login")
        }

        Button(
            onClick = { /* Aksi ketika tombol Register ditekan */ },
            modifier = Modifier
                .offset(y = 550.dp)
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text("Register")
        }
    }
}

@Preview (showBackground = true)
@Composable
fun LoginScreenPreview() {
    Capstone1Theme {
        LoginScreen()
    }
}