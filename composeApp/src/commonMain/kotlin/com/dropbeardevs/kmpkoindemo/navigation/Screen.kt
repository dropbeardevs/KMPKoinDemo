package com.dropbeardevs.kmpkoindemo.navigation

sealed class Screen(val route: String) {
    data object Home : Screen(route = "home")
}