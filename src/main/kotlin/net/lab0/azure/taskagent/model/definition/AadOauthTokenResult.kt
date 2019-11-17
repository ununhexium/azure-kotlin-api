package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface AadOauthTokenResult {
  val accessToken: String

  val refreshTokenCache: String
}
