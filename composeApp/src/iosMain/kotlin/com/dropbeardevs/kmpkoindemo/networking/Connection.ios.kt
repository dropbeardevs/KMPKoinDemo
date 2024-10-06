package com.dropbeardevs.kmpkoindemo.networking

class IosConnectionImpl() : Connection {
    override fun connectionStatus(): String {
        return "iOS Connected!"
    }
}