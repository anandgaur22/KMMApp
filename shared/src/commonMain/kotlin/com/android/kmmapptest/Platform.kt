package com.android.kmmapptest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform