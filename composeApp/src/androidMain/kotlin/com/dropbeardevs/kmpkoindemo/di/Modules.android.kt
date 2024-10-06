package com.dropbeardevs.kmpkoindemo.di

import com.dropbeardevs.kmpkoindemo.data.Repository
import com.dropbeardevs.kmpkoindemo.data.RepositoryImpl
import com.dropbeardevs.kmpkoindemo.networking.Connection
import com.dropbeardevs.kmpkoindemo.networking.AndroidConnectionImpl
import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformModule: Module = module {
    single<Repository> { RepositoryImpl() }
    single<Connection> { AndroidConnectionImpl() }
}
