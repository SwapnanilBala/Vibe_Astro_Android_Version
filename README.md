# Lagna Atelier — Android (early scaffold)

A native Android shell for [Lagna Atelier](https://lagnaatelier.site), my Vedic astrology app.
The working product is the web app ([source](https://github.com/SwapnanilBala/Large_Astro_Web_App)).
This repo is the start of a native client and is **not functional yet**.

## Where it stands

| Done | Not yet |
|---|---|
| Jetpack Compose + Material 3 app shell and theme | Every screen except Home is a placeholder |
| Navigation graph with 10 routes: home, engine select, insights, compatibility, forecast, palm reading, workspace, login, register, pricing | Real Supabase config: the client still holds `YOUR_SUPABASE_URL` / `YOUR_SUPABASE_ANON_KEY` placeholders |
| Koin dependency injection wired at startup | Data model for charts, readings and accounts |
| Supabase client module (auth, Postgrest, realtime, storage) | Tests |
| Manifest permissions for camera (palm reading), location, notifications | |

## Stack

Kotlin 2.1 · Jetpack Compose (BOM 2025.05) · Material 3 · Navigation Compose · Koin 4 ·
Supabase Kotlin 3.1 · Retrofit / OkHttp · Room · DataStore · CameraX · Coil · Lottie

`minSdk 26`, `targetSdk 36`, AGP 9.1.

## Run it

1. Open the folder in a current Android Studio. AGP 9.1 needs a recent release.
2. Let Gradle sync. `local.properties` with your `sdk.dir` is created automatically.
3. Run the `app` configuration on an emulator or device.

Before wiring real data, move the Supabase URL and anon key out of
`di/SupabaseModule.kt` into `BuildConfig` fields read from `local.properties`, and keep them out of git.

## Structure

```text
app/src/main/java/com/lagnaatelier/app/
├── LagnaAtelierApp.kt        Application: starts Koin
├── MainActivity.kt           single activity, hosts the Compose tree
├── di/                       Koin modules, including the Supabase client
└── ui/
    ├── navigation/           NavRoutes (10 destinations) + LagnaNavHost
    ├── screens/home/         the one implemented screen
    └── theme/                colours, typography, Material 3 theme
```
