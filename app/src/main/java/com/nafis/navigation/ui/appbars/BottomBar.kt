package com.nafis.navigation.ui.appbars

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBar(navController: NavController) {

    val items = listOf(
        TabItem("Main", Icons.Default.Home, "home"),
        TabItem("Info", Icons.Default.Info, "info"),
        TabItem("Favorite", Icons.Default.Favorite, "favorite")
    )

    NavigationBar {

        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route

        items.forEach { tab ->

            NavigationBarItem(
                selected = currentRoute == tab.route,

                onClick = {
                    navController.navigate(tab.route) {
                        popUpTo("home")
                        launchSingleTop = true
                    }
                },

                icon = {
                    Icon(tab.icon, contentDescription = tab.title)
                },

                label = { Text(tab.title) }
            )
        }
    }
}
