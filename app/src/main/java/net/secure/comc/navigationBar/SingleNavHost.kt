package net.secure.comc.navigationBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.secure.comc.ui.screens.HomeScreen
import net.secure.comc.ui.screens.LoginScreen

@Composable
fun SingleNavHost(
    viewModel: AppViewModel,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                viewModel = viewModel,
                onNavigateToLoginScreen = {
                    navController.navigate("login")
                }
            )
        }
        composable("login") {
            LoginScreen()
        }
    }
}