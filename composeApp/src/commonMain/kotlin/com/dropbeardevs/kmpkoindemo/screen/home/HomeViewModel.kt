package com.dropbeardevs.kmpkoindemo.screen.home

import androidx.lifecycle.ViewModel
import com.dropbeardevs.kmpkoindemo.data.Repository

class HomeViewModel(private val repository: Repository) : ViewModel() {
    fun getHelloWorldString(): String {
        return repository.helloWorld()
    }
}