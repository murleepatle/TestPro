package net.secure.comc.navigationBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.secure.comc.ui.screens.HomeScreen
import net.secure.comc.ui.screens.ProfileScreen
import net.secure.comc.ui.screens.ReportScreen

@Composable
fun BottomNavGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = BottomBarScreen.Home.route){
        composable(route=BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route=BottomBarScreen.Report.route){
            ReportScreen()
        }
        composable(route=BottomBarScreen.Profile.route){
            ProfileScreen()
        }
    }
}