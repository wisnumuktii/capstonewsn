package com.wisnumkt.capstone1.model
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.wisnumkt.capstone1.ui.login.AuthViewModel
import com.wisnumkt.capstone1.ui.login.LoginScreen
import com.wisnumkt.capstone1.ui.register.RegistScreen

@Composable
fun MainNavGraph(
    navController: NavController,
    viewModel: AuthViewModel
) {
    val navGraphBuilder: NavGraphBuilder.() -> Unit = {
        composable(Screen.Login.route) {
            LoginScreen(viewModel = viewModel, navController = navController)
        }
        composable(Screen.Regist.route) {
            RegistScreen(navController = navController)
        }
        // Add other composable destinations as needed
    }

    navController.graph.apply {
        startDestination = Screen.Login.route
        addNavGraph(navController.graphId, navGraphBuilder)
    }
}

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Regist : Screen("regist")
    // Add other screens as needed
}