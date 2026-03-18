package com.lagnaatelier.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.lagnaatelier.app.ui.navigation.LagnaNavHost
import com.lagnaatelier.app.ui.theme.LagnaAtelierTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            LagnaAtelierTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    LagnaNavHost()
                }
            }
        }
    }
}
