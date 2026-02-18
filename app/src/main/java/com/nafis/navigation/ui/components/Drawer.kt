package com.nafis.navigation.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Help
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Drawer() {
    ModalDrawerSheet {

        Text(
            text = "Drawer Title",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.titleLarge
        )

        HorizontalDivider()

        Text(
            text = "Section 1",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.titleMedium
        )

        NavigationDrawerItem(
            label = { Text("Item 1") },
            selected = false,
            onClick = {}
        )

        NavigationDrawerItem(
            label = { Text("Item 2") },
            selected = false,
            onClick = {}
        )

        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

        Text(
            text = "Section 2",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.titleMedium
        )

        NavigationDrawerItem(
            label = { Text("Settings") },
            selected = false,
            icon = {
                Icon(Icons.Outlined.Settings, contentDescription = null)
            },
            onClick = {}
        )

        NavigationDrawerItem(
            label = { Text("Help and feedback") },
            selected = false,
            icon = {
                Icon(Icons.Outlined.Help, contentDescription = null)
            },
            onClick = {}
        )

        Spacer(modifier = Modifier.height(12.dp))
    }
}
