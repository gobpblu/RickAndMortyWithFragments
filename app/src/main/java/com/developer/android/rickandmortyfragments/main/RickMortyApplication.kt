package com.developer.android.rickandmortyfragments.main

import android.app.Application
import timber.log.Timber

class RickMortyApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}