package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String

interface OAuthEndpointStatus {
  val state: String

  val statusMessage: String
}
