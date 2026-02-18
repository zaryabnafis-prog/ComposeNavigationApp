package com.nafis.navigation.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import kotlinx.coroutines.launch

import com.nafis.navigation.ui.appbars.BottomBar
import com.nafis.navigation.ui.appbars.TopBar
import com.nafis.navigation.ui.components.Drawer

@Composable
fun ScaffoldApp() {

    val navController = rememberNavController()

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            Drawer()
        }
    ) {

        Scaffold(
            topBar = {
                TopBar {
                    scope.launch { drawerState.open() }
                }
            },
            bottomBar = { BottomBar(navController) }
        ) { innerPadding ->

            NavHost(
                navController = navController,
                startDestination = "main",
                modifier = Modifier.padding(innerPadding)
            ) {

                composable("main") { MainScreen() }
                composable("info") { InfoScreen() }
                composable("favorite") { FavoriteScreen() }
            }
        }
    }
}
