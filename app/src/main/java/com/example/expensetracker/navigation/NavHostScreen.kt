package com.example.expensetracker.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.expensetracker.screens.AddExpenseScreen
import com.example.expensetracker.screens.HomeScreen

@Composable
fun NavHostScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "HOME") {
        composable(route = "HOME") {
            HomeScreen(navController)
        }
        composable(route = "ADD_EXPENSE") {
            AddExpenseScreen(navController)
        }
    }
}