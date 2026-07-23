package com.arra.JetPackComposeTutorial.ui.theme

sealed class Screens(val screen: String) {

    data object Home : Screens("Home")
    data object Search : Screens("Search")
    data object Notification : Screens("Notification")
    data object Profile : Screens("Profile")
    data object Settings : Screens("Settings")

    data object PostScreen: Screens("Post")
    data object CreateReels: Screens("CreateReels")

}