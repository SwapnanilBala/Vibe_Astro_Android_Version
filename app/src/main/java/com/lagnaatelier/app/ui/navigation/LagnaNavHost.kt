package com.lagnaatelier.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lagnaatelier.app.ui.screens.home.HomeScreen

@Composable
fun LagnaNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Home,
        modifier = modifier,
    ) {
        composable<NavRoute.Home> {
            HomeScreen(
                onNavigateToEngineSelect = { navController.navigate(NavRoute.EngineSelect) },
                onNavigateToWorkspace = { navController.navigate(NavRoute.Workspace) },
                onNavigateToLogin = { navController.navigate(NavRoute.Login) },
            )
        }

        composable<NavRoute.EngineSelect> {
            // TODO: EngineSelectScreen
        }

        composable<NavRoute.Insights> {
            // TODO: InsightsScreen
        }

        composable<NavRoute.Compatibility> {
            // TODO: CompatibilityScreen
        }

        composable<NavRoute.Forecast> {
            // TODO: ForecastScreen
        }

        composable<NavRoute.PalmReading> {
            // TODO: PalmReadingScreen
        }

        composable<NavRoute.Workspace> {
            // TODO: WorkspaceScreen
        }

        composable<NavRoute.Login> {
            // TODO: LoginScreen
        }

        composable<NavRoute.Register> {
            // TODO: RegisterScreen
        }

        composable<NavRoute.Pricing> {
            // TODO: PricingScreen
        }
    }
}
