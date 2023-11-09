package com.example.projectmobileappdev.presentation

data class BluetoothUiState(
    val scannedDevices: List<com.example.projectmobileappdev.domain.chat.BluetoothDevice> = emptyList(),
    val pairedDevices: List<com.example.projectmobileappdev.domain.chat.BluetoothDevice> = emptyList(),
)
