package com.template.kmp.network

import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*

actual class HttpClientFactory {
  actual fun create(): HttpClient {
    return HttpClient(Android) {
      commonConfig()
    }
  }
}