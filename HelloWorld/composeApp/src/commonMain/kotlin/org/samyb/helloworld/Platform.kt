package org.samyb.helloworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform