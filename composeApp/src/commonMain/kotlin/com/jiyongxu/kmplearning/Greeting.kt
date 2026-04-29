package com.jiyongxu.kmplearning

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "KMP 学习开始，当前平台是 ${platform.name}!"
    }
}