package com.lagnaatelier.app

import android.app.Application
import com.lagnaatelier.app.di.appModule
import com.lagnaatelier.app.di.supabaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class LagnaAtelierApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@LagnaAtelierApp)
            modules(appModule, supabaseModule)
        }
    }
}
