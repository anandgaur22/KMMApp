package com.android.kmmapptest

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello Anand, ${platform.name}!"
    }
}