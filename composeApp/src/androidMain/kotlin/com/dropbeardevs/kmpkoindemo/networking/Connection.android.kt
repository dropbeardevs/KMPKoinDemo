package com.dropbeardevs.kmpkoindemo.networking

class AndroidConnectionImpl() : Connection {
    override fun connectionStatus(): String {
        return "Android Connected!"
    }
}