package com.nafis.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nafis.navigation.ui.screens.ScaffoldApp
import com.nafis.navigation.ui.theme.ComposeNavigationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeNavigationAppTheme {
                ScaffoldApp()
            }
        }
    }
}
