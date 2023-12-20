package com.wisnumkt.capstone1.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wisnumkt.capstone1.componen.BottomNews
import com.wisnumkt.capstone1.componen.MainFitur
import com.wisnumkt.capstone1.componen.MainTopBar
import com.wisnumkt.capstone1.componen.RekomendList
import com.wisnumkt.capstone1.componen.TopProfile
import com.wisnumkt.capstone1.ui.login.AuthViewModel
import com.wisnumkt.capstone1.ui.theme.Capstone1Theme

@Composable
fun HomeScreen(
    navController: NavController? = null,
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        MainTopBar()
        TopProfile()
        MainFitur(navController = navController ?: rememberNavController()) // Pass the navController parameter
        BottomNews()
        RekomendList()
    }
}

private fun NavGraphBuilder.addHome(navController: NavController, viewModel: AuthViewModel) {
    composable("home") {
        HomeScreen(
            navController = navController,
            viewModel = viewModel
        )
    }
}
