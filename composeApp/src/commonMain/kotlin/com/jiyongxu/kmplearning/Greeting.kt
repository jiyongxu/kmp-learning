package com.jiyongxu.kmplearning

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
//        return "KMP 学习开始，当前平台是 ${platform.name}!"
        return buildString {
            appendLine("KMP 学习开始，当前平台是 ${platform.name}")
            appendLine("设备信息：${getDeviceInfo()}")
        }
    }
}