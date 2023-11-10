package com.example.projectmobileappdev.presentation
//data class that represents the state of the scanned and paired devices.
data class BluetoothUiState(
    val scannedDevices: List<com.example.projectmobileappdev.domain.chat.BluetoothDevice> = emptyList(),
    val pairedDevices: List<com.example.projectmobileappdev.domain.chat.BluetoothDevice> = emptyList(),
)
