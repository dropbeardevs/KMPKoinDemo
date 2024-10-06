package com.dropbeardevs.kmpkoindemo.screen.home

import androidx.lifecycle.ViewModel
import com.dropbeardevs.kmpkoindemo.data.Repository
import com.dropbeardevs.kmpkoindemo.networking.Connection

class HomeViewModel(
    private val repository: Repository,
    private val connection: Connection
) : ViewModel() {
    fun getHelloWorldString(): String {
        return repository.helloWorld()
    }

    fun getConnectionStatusString(): String {
        return connection.connectionStatus()
    }
}