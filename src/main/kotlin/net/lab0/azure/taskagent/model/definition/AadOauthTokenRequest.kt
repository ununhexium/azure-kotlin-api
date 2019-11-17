package net.lab0.azure.taskagent.model.definition

import kotlin.Boolean
import kotlin.String

interface AadOauthTokenRequest {
  val refresh: Boolean

  val resource: String

  val tenantId: String

  val token: String
}
