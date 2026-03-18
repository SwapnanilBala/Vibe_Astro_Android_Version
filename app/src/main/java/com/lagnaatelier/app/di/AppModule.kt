package com.lagnaatelier.app.di

import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import java.util.concurrent.TimeUnit

val appModule = module {

    single<Json> {
        Json {
            ignoreUnknownKeys = true
            coerceInputValues = true
            isLenient = true
        }
    }

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }
            )
            .build()
    }
}
