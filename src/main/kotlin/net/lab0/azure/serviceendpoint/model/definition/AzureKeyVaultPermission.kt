package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String

interface AzureKeyVaultPermission : AzureResourcePermission {
  val vault: String
}
