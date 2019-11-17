package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String

interface ServiceEndpointOAuthConfigurationReference {
  val configurationId: String

  val serviceEndpointId: String

  val serviceEndpointProjectId: String
}
