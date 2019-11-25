package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String

interface AzureResourcePermission : AzurePermission {
  val resourceGroup: String
}
