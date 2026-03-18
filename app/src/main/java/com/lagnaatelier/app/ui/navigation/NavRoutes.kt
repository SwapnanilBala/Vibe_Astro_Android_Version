package com.lagnaatelier.app.ui.navigation

import kotlinx.serialization.Serializable

sealed interface NavRoute {

    @Serializable
    data object Home : NavRoute

    @Serializable
    data object EngineSelect : NavRoute

    @Serializable
    data object Insights : NavRoute

    @Serializable
    data object Compatibility : NavRoute

    @Serializable
    data object Forecast : NavRoute

    @Serializable
    data object PalmReading : NavRoute

    @Serializable
    data object Workspace : NavRoute

    @Serializable
    data object Login : NavRoute

    @Serializable
    data object Register : NavRoute

    @Serializable
    data object Pricing : NavRoute
}
