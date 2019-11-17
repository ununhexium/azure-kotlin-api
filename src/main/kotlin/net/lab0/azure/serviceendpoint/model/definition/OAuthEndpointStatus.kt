package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String

interface OAuthEndpointStatus {
  val state: String

  val statusMessage: String
}
