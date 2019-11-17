package net.lab0.azure.serviceendpoint.model.definition

import kotlin.Boolean
import kotlin.String

interface AzurePermission {
  val provisioned: Boolean

  val resourceProvider: String
}
