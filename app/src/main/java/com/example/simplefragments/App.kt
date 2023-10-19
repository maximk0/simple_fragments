package com.example.simplefragments

import android.app.Application
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router

class App : Application() {
    private val cicerone = Cicerone.create()
    val getRouter
        get() = cicerone.router
    val navigatorHolder
        get() = cicerone.getNavigatorHolder()

    override fun onCreate() {
        super.onCreate()
        application = this
    }

    companion object {
        lateinit var application: App
            private set
    }
}