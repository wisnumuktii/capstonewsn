package com.wisnumkt.capstone1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wisnumkt.capstone1.componen.BottomBar
import com.wisnumkt.capstone1.model.BottomNavItem
import com.wisnumkt.capstone1.ui.chat.ChatScreen
import com.wisnumkt.capstone1.ui.home.HomeScreen
import com.wisnumkt.capstone1.ui.maps.MapsScreen
import com.wisnumkt.capstone1.ui.profile.ProfileScreen
import com.wisnumkt.capstone1.ui.theme.Capstone1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Capstone1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Capstone1()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Capstone1(modifier: Modifier = Modifier) {
    val (currentScreen, setCurrentScreen) = remember { mutableStateOf(BottomNavItem.Home) }

    Scaffold(
        bottomBar = {
            BottomBar(
                modifier = modifier,
                currentScreen = currentScreen,
                onItemSelected = { selectedScreen -> setCurrentScreen(selectedScreen) }
            )
        }
    ) { paddingValues -> // Start of Scaffold content block
        Column(
            modifier = modifier
                //.verticalScroll(rememberScrollState())
                .padding(paddingValues)
        ) {
            when (currentScreen) {
                BottomNavItem.Home -> HomeScreen()
                BottomNavItem.Place -> MapsScreen()
                BottomNavItem.Email -> ChatScreen()
                BottomNavItem.Person -> ProfileScreen()
                // Add other screens as necessary
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Capstone1Preview() {
    Capstone1Theme {
        Capstone1()
    }
}
