package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface AadOauthTokenResult {
  val accessToken: String

  val refreshTokenCache: String
}
