package com.template.kmp.randomuser.network

import com.template.kmp.randomuser.models.RandomUserDto
import com.template.kmp.randomuser.network.RandomUserError.SERVICE_UNAVAILABLE
import com.template.kmp.randomuser.network.RandomUserError.UNKNOWN_ERROR
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.request.url
import io.ktor.utils.io.errors.IOException

class KtorRandomUserClient(
  private val httpClient: HttpClient
) : RandomUserClient {
  override suspend fun getRandomUsers(count: Int): RandomUserDto {
    return try {
      httpClient.get {
        url("${NetworkConstants.BASE_URL}/api")
        parameter("results", count)
      }.body()
    } catch (e: IOException) {
      throw RandomUserException(SERVICE_UNAVAILABLE)
    } catch (e: Exception) {
      throw RandomUserException(UNKNOWN_ERROR)
    }
  }
}