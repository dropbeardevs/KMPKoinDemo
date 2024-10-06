package com.dropbeardevs.kmpkoindemo.di

import com.dropbeardevs.kmpkoindemo.data.Repository
import com.dropbeardevs.kmpkoindemo.data.RepositoryImpl
import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformModule: Module = module {
    single<Repository> { RepositoryImpl() }
}
