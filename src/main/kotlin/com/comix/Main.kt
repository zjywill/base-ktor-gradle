package com.comix

import org.jetbrains.ktor.application.Application
import org.jetbrains.ktor.application.install
import org.jetbrains.ktor.content.files
import org.jetbrains.ktor.content.static
import org.jetbrains.ktor.features.DefaultHeaders
import org.jetbrains.ktor.routing.routing

fun Application.main() {
    install(DefaultHeaders)
    routing {
        static("static") {
            files("content/images")
        }
        static("/") {
            files("src/main/resources/web")
            files("src/main/resources/web/index.html")
        }
    }
}

