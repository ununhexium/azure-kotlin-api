package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String

interface AzureResourcePermission : AzurePermission {
  val resourceGroup: String
}
