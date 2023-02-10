package net.secure.comc.navigationBar

import net.secure.comc.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {
    // for home
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.ic_email,
        icon_focused = R.drawable.ic_email_outline
    )
    // for report
    object Report : BottomBarScreen(
        route = "report",
        title = "Report",
        icon = R.drawable.ic_password,
        icon_focused = R.drawable.ic_email_outline
    )
    // for profile
    object Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.ic_more_menu,
        icon_focused = R.drawable.ic_more_menu
    )
}
