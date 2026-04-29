package com.jiyongxu.kmplearning

import android.os.Build

actual fun getDeviceInfo(): String {
    return "Android SDK ${Build.VERSION.SDK_INT}, ${Build.MANUFACTURER} ${Build.MODEL}"
}