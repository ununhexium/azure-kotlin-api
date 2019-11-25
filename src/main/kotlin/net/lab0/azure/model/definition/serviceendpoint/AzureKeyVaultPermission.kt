package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String

interface AzureKeyVaultPermission : AzureResourcePermission {
  val vault: String
}
