package com.dropbeardevs.kmpkoindemo

import com.dropbeardevs.kmpkoindemo.data.Repository
import com.dropbeardevs.kmpkoindemo.di.sharedModule
import com.dropbeardevs.kmpkoindemo.di.platformModule
import org.koin.core.context.startKoin
import org.koin.dsl.module


fun initKoin(repository: Repository) {
    startKoin {
        modules(sharedModule, platformModule, module { single { repository } })
    }
}