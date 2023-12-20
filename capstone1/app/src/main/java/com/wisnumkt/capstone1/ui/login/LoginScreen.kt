package com.wisnumkt.capstone1.ui.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.wisnumkt.capstone1.ui.theme.Capstone1Theme
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(viewModel: AuthViewModel, navController: NavController) {
    val isAuthenticated: State<Boolean> = viewModel.isAuthenticated
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

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
                .fillMaxWidth()
                .fillMaxHeight()
                .offset(x = 157.dp, y = 300.dp)
        )

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            singleLine = true,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .offset(y = 338.dp)
        )

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            singleLine = true,
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = null) },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .offset(y = 420.dp)
        )

        Button(
            onClick = {
                // Panggil fungsi login dari AuthViewModel dengan menggunakan Firebase
                GlobalScope.launch {
                    viewModel.login(email, password, navController)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .offset(y = 498.dp)
        ) {
            Text("Login")
        }

        Button(
            onClick = { /* Action when the Register button is pressed */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .offset(y = 550.dp)
        ) {
            Text("Register")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    val fakeViewModel = AuthViewModel()
    Capstone1Theme {
        LoginScreen(viewModel = fakeViewModel, navController = rememberNavController())
    }
}
