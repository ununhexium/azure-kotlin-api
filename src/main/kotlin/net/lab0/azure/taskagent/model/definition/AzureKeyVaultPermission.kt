package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface AzureKeyVaultPermission : AzureResourcePermission {
  val vault: String
}
