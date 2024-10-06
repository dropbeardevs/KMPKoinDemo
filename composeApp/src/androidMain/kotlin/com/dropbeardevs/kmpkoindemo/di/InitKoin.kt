package com.dropbeardevs.kmpkoindemo.di

import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(sharedModule, platformModule)
    }
}