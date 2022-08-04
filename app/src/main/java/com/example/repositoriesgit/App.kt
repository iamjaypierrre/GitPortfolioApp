package com.example.repositoriesgit

import android.app.Application
import android.app.Presentation

import com.example.repositoriesgit.data.di.DataModule
import com.example.repositoriesgit.domain.di.DomainModule
import com.example.repositoriesgit.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}