package com.jiyongxu.kmplearning

import platform.UIKit.UIDevice

actual fun getDeviceInfo(): String {
    val device = UIDevice.currentDevice

    return "${device.name}, ${device.systemName()}, ${device.systemVersion}"
}