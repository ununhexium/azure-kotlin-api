package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface AzureKeyVaultPermission : AzureResourcePermission {
  val vault: String
}
