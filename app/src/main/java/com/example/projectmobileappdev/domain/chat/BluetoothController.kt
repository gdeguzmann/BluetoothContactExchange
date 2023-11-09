package com.example.projectmobileappdev.domain.chat

import kotlinx.coroutines.flow.StateFlow

interface BluetoothController {
    // Stateflow that represents a list of scanned and paired bluetooth devices.
    val scannedDevices: StateFlow<List<BluetoothDevice>>
    val pairedDevices: StateFlow<List<BluetoothDevice>>
    //function that starts and stops the discovery process for bluetooth devices.
    fun startDiscovery()
    fun stopDiscovery()
    //function that releases any resources being used by the controller
    fun release()
}
