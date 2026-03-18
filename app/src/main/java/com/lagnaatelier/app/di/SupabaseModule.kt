package com.lagnaatelier.app.di

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.realtime.Realtime
import io.github.jan.supabase.storage.Storage
import org.koin.dsl.module

val supabaseModule = module {

    single<SupabaseClient> {
        createSupabaseClient(
            supabaseUrl = "YOUR_SUPABASE_URL",      // TODO: Move to BuildConfig
            supabaseKey = "YOUR_SUPABASE_ANON_KEY",  // TODO: Move to BuildConfig
        ) {
            install(Auth)
            install(Postgrest)
            install(Realtime)
            install(Storage)
        }
    }
}
