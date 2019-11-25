package net.lab0.azure.model.definition.serviceendpoint

import kotlin.Boolean
import kotlin.String

interface AzurePermission {
  val provisioned: Boolean

  val resourceProvider: String
}
