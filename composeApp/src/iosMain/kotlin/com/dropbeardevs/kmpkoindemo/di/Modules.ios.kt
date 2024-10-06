package com.dropbeardevs.kmpkoindemo.di

import org.koin.core.module.Module
import org.koin.dsl.module
import com.dropbeardevs.kmpkoindemo.networking.Connection
import com.dropbeardevs.kmpkoindemo.networking.IosConnectionImpl

actual val platformModule: Module = module {
    single<Connection> { IosConnectionImpl() }
}
