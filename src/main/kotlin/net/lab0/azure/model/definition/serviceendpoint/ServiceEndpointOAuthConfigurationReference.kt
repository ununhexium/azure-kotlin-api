package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String

interface ServiceEndpointOAuthConfigurationReference {
  val configurationId: String

  val serviceEndpointId: String

  val serviceEndpointProjectId: String
}
