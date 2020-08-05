package com.sunnyweather.android

import android.app.Application
import android.content.Context

class MyApp: Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = ""
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}