package com.dropbeardevs.kmpkoindemo.di

import com.dropbeardevs.kmpkoindemo.screen.home.HomeViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    viewModel {
        HomeViewModel(get(), get())
    }
}
