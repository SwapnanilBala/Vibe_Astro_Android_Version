package com.lagnaatelier.app.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Lagna Atelier is a dark-first cosmic theme
private val DarkColorScheme = darkColorScheme(
    primary = CelestialGold,
    onPrimary = CosmicNavy,
    primaryContainer = CelestialGoldDim,
    onPrimaryContainer = StarWhite,

    secondary = AstralAqua,
    onSecondary = CosmicNavy,
    secondaryContainer = AstralTeal,
    onSecondaryContainer = StarWhite,

    tertiary = CosmicViolet,
    onTertiary = StarWhite,
    tertiaryContainer = CosmicPurple,
    onTertiaryContainer = StarWhite,

    error = NebulaCoral,
    onError = CosmicNavy,
    errorContainer = NebulaRose,
    onErrorContainer = StarWhite,

    background = CosmicNavy,
    onBackground = StarWhite,

    surface = CosmicDarkBlue,
    onSurface = StarWhite,
    surfaceVariant = CosmicMidnight,
    onSurfaceVariant = StarSilver,

    outline = DuskGray,
    outlineVariant = GlassBorder,

    inverseSurface = StarWhite,
    inverseOnSurface = CosmicNavy,
    inversePrimary = CelestialGoldDim,

    surfaceTint = CelestialGold,
)

private val LightColorScheme = lightColorScheme(
    primary = CelestialGoldDim,
    onPrimary = StarWhite,
    primaryContainer = CelestialGoldLight,
    onPrimaryContainer = CosmicNavy,

    secondary = AstralTeal,
    onSecondary = StarWhite,
    secondaryContainer = AstralCyan,
    onSecondaryContainer = CosmicNavy,

    tertiary = CosmicPurple,
    onTertiary = StarWhite,
    tertiaryContainer = CosmicLavender,
    onTertiaryContainer = CosmicNavy,

    background = StarWhite,
    onBackground = CosmicNavy,

    surface = StarWhite,
    onSurface = CosmicNavy,
    surfaceVariant = StarSilver,
    onSurfaceVariant = DuskGray,
)

@Composable
fun LagnaAtelierTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = !darkTheme
                isAppearanceLightNavigationBars = !darkTheme
            }
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = LagnaTypography,
        content = content,
    )
}
