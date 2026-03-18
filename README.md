# Lagna Atelier

This repository looks like the beginning of an Android app for an astrology and spiritual guidance product.

At the moment, it reads like an early prototype where we were trying to assemble the core building blocks first:

- a Jetpack Compose Android app shell
- navigation for multiple future flows
- Supabase for auth, database, realtime, and storage
- local persistence with Room and DataStore
- CameraX for a palm-reading style feature
- location, notifications, and media/export-related app permissions
- Koin-based dependency injection
- Retrofit, OkHttp, Coil, and Lottie for networking and UI support

## What We Seem To Be Building

Based on the current route names and dependencies, the app appears to be aiming toward a multi-feature astrology experience with screens or flows for:

- home
- engine selection
- insights
- compatibility
- forecast
- palm reading
- workspace
- login and registration
- pricing

The project name, app label, and navigation setup all point toward this being a branded mobile experience called `Lagna Atelier`.

## Current State

Right now the codebase is still very early:

- the app launches into a Compose home screen that only shows the title
- the navigation graph is present, but most destinations are still TODO placeholders
- Koin is wired up at application startup
- the Supabase client module exists, but it still contains placeholder credentials
- the Android manifest already includes permissions for internet, camera, location, notifications, storage access, and vibration

So this repo is better described as a scaffold or foundation than a finished application.

## Tech Stack

- Kotlin
- Jetpack Compose
- Material 3
- Android Navigation Compose
- Koin
- Supabase Kotlin client
- Retrofit + OkHttp
- Room
- DataStore
- CameraX
- Coil
- Lottie

## Notes For Future Work

Some obvious next steps if development continues:

- move Supabase secrets out of source and into safer config
- replace placeholder screens with real feature flows
- connect navigation to actual user journeys
- define the data model for charts, readings, accounts, and saved work
- add tests once the first real features settle down

## Local Development

This is an Android Studio / Gradle project.

Typical setup would be:

1. Open the project in Android Studio.
2. Make sure your Android SDK path is available through `local.properties`.
3. Replace the placeholder Supabase values with real project config.
4. Build or run the `app` module on an emulator or device.

This README is intentionally preliminary and should be updated once the product direction and feature set are more concrete.
